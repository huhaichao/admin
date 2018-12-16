package com.irevest.home.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.irevest.common.utils.R;
import com.irevest.common.utils.RedisUtil;
import com.irevest.home.service.impl.AboutServiceImpl;
import com.irevest.niu.domain.HomeAdviceDO;
import com.irevest.niu.domain.HomeStationDO;
import com.irevest.niu.service.HomeAdviceService;
import com.irevest.niu.service.HomeStationService;
import com.irevest.niu.service.impl.HomeAdviceServiceImpl;

@RequestMapping("/home")
@Controller
public class HomeController {
	@Autowired
	private HomeStationService homeStationService;
	@Autowired
	private HomeAdviceService homeAdviceService;
    @Autowired
    private RedisUtil redisUtil;
	
	@GetMapping()
	String home(Model mode) {
		HomeStationDO homeStationCdym=new HomeStationDO();
		HomeStationDO homeStationLxtp=new HomeStationDO();
		HomeStationDO homeStationGplc=new HomeStationDO();
		HomeStationDO homeStationCpjs=new HomeStationDO();
		HomeStationDO homeStationSwhz=new HomeStationDO();
		HomeStationDO homeStationGywm=new HomeStationDO();
		HomeStationDO homeStationLxfs=new HomeStationDO();
		HomeStationDO homeStationWzdb=new HomeStationDO();
		if(redisUtil.get("cdym")==null){
			homeStationCdym=homeStationService.get(1l);
			redisUtil.set("cdym", homeStationCdym);
		}
		if(redisUtil.get("lxtp")==null){
			homeStationLxtp=homeStationService.get(2l);
			redisUtil.set("lxtp", homeStationLxtp);
		}
		if(redisUtil.get("gplc")==null){
			homeStationGplc=homeStationService.get(3l);
			redisUtil.set("gplc", homeStationGplc);
		}
		if(redisUtil.get("cpjs")==null){
			 homeStationCpjs=homeStationService.get(4l);
			 redisUtil.set("cpjs", homeStationCpjs);
		}
		if(redisUtil.get("swhz")==null){
			homeStationSwhz=homeStationService.get(5l);
			redisUtil.set("swhz", homeStationSwhz);
		}
		if(redisUtil.get("gywm")==null){
			homeStationGywm=homeStationService.get(6l);
			redisUtil.set("gywm", homeStationGywm);
		}
		if(redisUtil.get("lxfs")==null){
			homeStationLxfs=homeStationService.get(7l);
			redisUtil.set("lxfs", homeStationLxfs);
		}
		if(redisUtil.get("wzdb")==null){
			 homeStationWzdb=homeStationService.get(8l);
			 redisUtil.set("wzdb", homeStationWzdb);
		}
		mode.addAttribute("cdym", redisUtil.get("cdym"));
		mode.addAttribute("lxtp", redisUtil.get("lxtp"));
		mode.addAttribute("gplc", redisUtil.get("gplc"));
		mode.addAttribute("cpjs", redisUtil.get("cpjs"));
		mode.addAttribute("swhz", redisUtil.get("swhz"));
		mode.addAttribute("gywm", redisUtil.get("gywm"));
		mode.addAttribute("lxfs", redisUtil.get("lxfs"));
		mode.addAttribute("wzdb", redisUtil.get("wzdb"));
		return "home/index";
	}
	
	
}
