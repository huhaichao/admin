package com.irevest.niu.controller;
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
import com.irevest.niu.domain.HomeStationDO;
import com.irevest.niu.service.HomeStationService;
import com.irevest.common.utils.PageUtils;
import com.irevest.common.utils.Query;
import com.irevest.common.utils.R;
import com.irevest.common.utils.RedisUtil;

/**
 * 网站内容
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-11 14:10:07
 */
 
@Controller
@RequestMapping("/niu/homeStation")
public class HomeStationController {
	@Autowired
	private HomeStationService homeStationService;
    @Autowired
    private RedisUtil redisUtil;
	
	@GetMapping()
	@RequiresPermissions("niu:homeStation:homeStation")
	String HomeStation(Model model){
		HomeStationDO homeStation = homeStationService.get(1L);
		model.addAttribute("homeStation", homeStation);
	    return "niu/homeStation/homeStation";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("niu:homeStation:homeStation")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HomeStationDO> homeStationList = homeStationService.list(query);
		int total = homeStationService.count(query);
		PageUtils pageUtils = new PageUtils(homeStationList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("niu:homeStation:add")
	String add(){
	    return "niu/homeStation/add";
	}

	@GetMapping("/edit/{cid}")
	@RequiresPermissions("niu:homeStation:edit")
	String edit(@PathVariable("cid") Long cid,Model model){
		HomeStationDO homeStation = homeStationService.get(cid);
		model.addAttribute("homeStation", homeStation);
	    return "niu/homeStation/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("niu:homeStation:add")
	public R save( HomeStationDO homeStation){
		if(homeStationService.save(homeStation)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("niu:homeStation:edit")
	public R update( HomeStationDO homeStation){
		if (homeStation.getCid() ==1){
			redisUtil.del("cdym");
		}
		if(homeStation.getCid()==2){
			redisUtil.del("lxtp");
		}
		if(homeStation.getCid()==3){
			redisUtil.del("gplc");
		}
		if(homeStation.getCid()==4){
			redisUtil.del("cpjs");
		}
		if(homeStation.getCid()==5){
			redisUtil.del("swhz");
		}
		if(homeStation.getCid()==6){
			redisUtil.del("gywm");
		}
		if(homeStation.getCid()==7){
			redisUtil.del("lxfs");
		}
		if(homeStation.getCid()==8){
			redisUtil.del("wzdb");
		}
		homeStationService.update(homeStation);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("niu:homeStation:remove")
	public R remove( Long cid){
		if(homeStationService.remove(cid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("niu:homeStation:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] cids){
		homeStationService.batchRemove(cids);
		return R.ok();
	}
	
}
