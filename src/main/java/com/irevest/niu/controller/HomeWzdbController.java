package com.irevest.niu.controller;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.irevest.niu.domain.HomeStationDO;
import com.irevest.niu.service.HomeStationService;

/**
 * 网站底部
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-11 14:10:07
 */
 
@Controller
@RequestMapping("/niu/homeWzdb")
public class HomeWzdbController {
	@Autowired
	private HomeStationService homeStationService;
	
	@GetMapping()
	@RequiresPermissions("niu:homeStation:homeStation")
	String HomeStation(Model model){
		HomeStationDO homeStation = homeStationService.get(8L);
		model.addAttribute("homeStation", homeStation);
		return "niu/homeStation/homeStation";
	}		
}
