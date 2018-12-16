package com.irevest.niu.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import com.irevest.niu.domain.HomeAdviceDO;
import com.irevest.niu.service.HomeAdviceService;
import com.irevest.common.utils.PageUtils;
import com.irevest.common.utils.Query;
import com.irevest.common.utils.R;

/**
 * 意见信息表
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-11 23:32:43
 */
 
@Controller
@RequestMapping("/niu/homeAdvice")
public class HomeAdviceController {
	@Autowired
	private HomeAdviceService homeAdviceService;
	
	@GetMapping()
	@RequiresPermissions("niu:homeAdvice:homeAdvice")
	String HomeAdvice(){
	    return "niu/homeAdvice/homeAdvice";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("niu:homeAdvice:homeAdvice")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HomeAdviceDO> homeAdviceList = homeAdviceService.list(query);
		int total = homeAdviceService.count(query);
		PageUtils pageUtils = new PageUtils(homeAdviceList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("niu:homeAdvice:add")
	String add(){
	    return "niu/homeAdvice/add";
	}

	@GetMapping("/edit/{cid}")
	@RequiresPermissions("niu:homeAdvice:edit")
	String edit(@PathVariable("cid") Long cid,Model model){
		HomeAdviceDO homeAdvice = homeAdviceService.get(cid);
		model.addAttribute("homeAdvice", homeAdvice);
	    return "niu/homeAdvice/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("niu:homeAdvice:add")
	public R save( HomeAdviceDO homeAdvice){
		if(homeAdviceService.save(homeAdvice)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("niu:homeAdvice:edit")
	public R update( HomeAdviceDO homeAdvice){
		homeAdviceService.update(homeAdvice);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("niu:homeAdvice:remove")
	public R remove( Long cid){
		if(homeAdviceService.remove(cid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("niu:homeAdvice:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] cids){
		homeAdviceService.batchRemove(cids);
		return R.ok();
	}
	
	/**
	 * 提交建议或者意见
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/saveAdvice")
	public R saveAdvice(HttpServletRequest request, HttpServletResponse response){
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String text=request.getParameter("text");
		//根据条件判断是否重复提交
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", name);
		map.put("email", email);
		if(homeAdviceService.count(map)>0){
			return R.error("已经提交过,谢谢！");
		}
		HomeAdviceDO homeAdvice=new HomeAdviceDO();
		homeAdvice.setName(name);
		homeAdvice.setEmail(email);
		homeAdvice.setContent(text);
		homeAdvice.setGtmCreate(new Date());

		if(homeAdviceService.save(homeAdvice)>0){
			return R.ok("提交成功！");
		}else{
			return R.error("提交失败！");
		}
		
		
	}
	
}
