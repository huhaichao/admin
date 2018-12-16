 package com.irevest.niu.controller;
 
 import com.irevest.common.utils.PageUtils;
import com.irevest.common.utils.Query;
import com.irevest.common.utils.R;
import com.irevest.niu.domain.UserTradeDO;
import com.irevest.niu.domain.UserTradesDO;
import com.irevest.niu.service.UserTradeService;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 
 
 
 
 
 
 
 
 
 
 @Controller
 @RequestMapping({"/niu/userTrade"})
 public class UserTradeController
 {

	  @Autowired
	  private UserTradeService userTradeService;
	  
	  @GetMapping
	  @RequiresPermissions({"niu:userTrade:userTrade"})
	  String UserTrade()
	  {
	    return "niu/userTrade/userTrade";
	  }
	  
	  @GetMapping({"/userTrades"})
	  @RequiresPermissions({"niu:userTrade:userTrade"})
	  String UserTrades()
	  {
	    return "niu/userTrade/userTrades";
	  }
	  
	  @ResponseBody
	  @GetMapping({"/list"})
	  @RequiresPermissions({"niu:userTrade:userTrade"})
	  public PageUtils list(@RequestParam Map<String, Object> params)
	  {
	    Query query = new Query(params);
	    List<UserTradeDO> userTradeList = this.userTradeService.list(query);
	    int total = this.userTradeService.count(query);
	    PageUtils pageUtils = new PageUtils(userTradeList, total);
	    return pageUtils;
	  }
	  
	  @ResponseBody
	  @GetMapping({"/listTrades"})
	  @RequiresPermissions({"niu:userTrade:userTrade"})
	  public PageUtils listTrades(@RequestParam Map<String, Object> params)
	  {
	    List<UserTradesDO> userTradesList = null;
	    int total = 0;
	    
	    Query query = new Query(params);
	    List<UserTradeDO> userTradeList = this.userTradeService.list(query);
	    
	    String[] orderNo = new String[userTradeList.size()];
	    for (int i = 0; i < userTradeList.size(); i++) {
	      orderNo[i] = ((UserTradeDO)userTradeList.get(i)).getOrderNo();
	    }
	    query.put("robStatus", "success");
	    query.put("orderNo", orderNo);
	    if (orderNo.length > 0)
	    {
	      userTradesList = this.userTradeService.listTrades(query);
	      total = this.userTradeService.countTrades(query);
	    }
	    PageUtils pageUtils = new PageUtils(userTradesList, total);
	    return pageUtils;
	  }
	  
   
   @GetMapping({"/add"})
   @RequiresPermissions({"niu:userTrade:add"})
   String add() {
     return "niu/userTrade/add";
   }
   
   @GetMapping({"/edit/{id}"})
   @RequiresPermissions({"niu:userTrade:edit"})
   String edit(@PathVariable("id") Integer id, Model model) {
     UserTradeDO userTrade = this.userTradeService.get(id);
     model.addAttribute("userTrade", userTrade);
     return "niu/userTrade/edit";
   }
   
 
 
   @ResponseBody
   @PostMapping({"/save"})
   @RequiresPermissions({"niu:userTrade:add"})
   public R save(UserTradeDO userTrade)
   {
    if (this.userTradeService.save(userTrade) > 0) {
       return R.ok();
     }
     return R.error();
   }
   
 
   @ResponseBody
   @RequestMapping({"/update"})
   @RequiresPermissions({"niu:userTrade:edit"})
   public R update(UserTradeDO userTrade)
   {
     this.userTradeService.update(userTrade);
     return R.ok();
   }
   
 
 
   @PostMapping({"/remove"})
   @ResponseBody
   @RequiresPermissions({"niu:userTrade:remove"})
   public R remove(Integer id)
   {
     if (this.userTradeService.remove(id) > 0) {
       return R.ok();
     }
     return R.error();
   }
   
 
 
   @PostMapping({"/batchRemove"})
   @ResponseBody
   @RequiresPermissions({"niu:userTrade:batchRemove"})
   public R remove(@RequestParam("ids[]") Integer[] ids)
   {
     this.userTradeService.batchRemove(ids);
     return R.ok();
   }
 }