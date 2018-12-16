package com.irevest.home.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.irevest.home.domain.SyTeamDO;
import com.irevest.home.service.SyTeamService;
import com.irevest.common.utils.PageUtils;
import com.irevest.common.utils.Query;
import com.irevest.common.utils.R;

/**
 * 
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-07-11 10:05:08
 */
 
@Controller
@RequestMapping("/home/syTeam")
public class SyTeamController {
	@Autowired
	private SyTeamService syTeamService;
	
	@GetMapping()
	@RequiresPermissions("home:syTeam:syTeam")
	String SyTeam(){
	    return "home/syTeam/syTeam";
	}
	
	
	@GetMapping("/list")
	@ResponseBody
	@RequiresPermissions("home:syTeam:syTeam")
	public Object list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SyTeamDO> syTeamList = syTeamService.list(query);
		int total = syTeamService.count(query);
		PageUtils pageUtils = new PageUtils(syTeamList, total);
		 Object json = JSONObject.toJSON(pageUtils);
		//System.out.println("=========="+json);
		return json;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("home:syTeam:add")
	String add(){
	    return "home/syTeam/add";
	}

	@GetMapping("/edit/{tSyId}")
	@RequiresPermissions("home:syTeam:edit")
	String edit(@PathVariable("tSyId") Integer tSyId,Model model){
		SyTeamDO syTeam = syTeamService.get(tSyId);
		model.addAttribute("syTeam", syTeam);
	    return "home/syTeam/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("home:syTeam:add")
	public R save( SyTeamDO syTeam){
		if(syTeamService.save(syTeam)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("home:syTeam:edit")
	public R update( SyTeamDO syTeam){
		syTeamService.update(syTeam);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("home:syTeam:remove")
	public R remove( Integer tSyId){
		if(syTeamService.remove(tSyId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("home:syTeam:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] tSyIds){
		syTeamService.batchRemove(tSyIds);
		return R.ok();
	}
	
}
