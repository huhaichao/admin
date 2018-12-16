package com.irevest.home.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.irevest.home.domain.AboutDO;

import com.irevest.home.service.AboutService;
import com.irevest.home.service.SyTeamService;

import com.irevest.niu.domain.HomeStationDO;

import com.irevest.niu.service.HomeStationService;
/**
 * 该类主要用于前台ajax获取首页的数据信息
 * @author VULCAN
 *
 */
@RequestMapping("/home/about")
@Controller
public class AboutController {
	@Autowired
	AboutService bAboutService;
	@Autowired
	SyTeamService sTeamService;
	@Autowired
	HomeStationService homeStationService;
/**
 * 根据类型查询关于我们数据信息
 * @param cid
 * @param model
 * @return
 */
	@GetMapping("/edit")
	@RequiresPermissions("home:bAbout:edit")
	String edit(Model model) {
		AboutDO bAboutDO = bAboutService.getType("me");
		model.addAttribute("bAbout", bAboutDO);
		return "home/about/edit";
	}
	
	/**
	 * 根据id获取context数据信息
	 * @param params
	 * @return
	 */
	@ResponseBody
	//@RequestMapping(value = "/open/getType/{employeeNumber}",method = RequestMethod.GET)
	@GetMapping("/open/getType")
	public  Object getTeamJson(HttpServletRequest request, HttpServletResponse response){
		//查询列表数据
		String cid=request.getParameter("cid");
		HomeStationDO homeStation = homeStationService.get(Long.parseLong(cid));
        Object json = JSONObject.toJSON(homeStation);
		return json;
	} 
	

	
}
