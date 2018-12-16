/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.CityUtil;
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.SiteDO;
/*     */ import com.irevest.niu.service.SiteService;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.http.client.ClientProtocolException;
/*     */ import org.apache.shiro.authz.annotation.RequiresPermissions;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.ui.Model;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
/*     */ import org.springframework.web.bind.annotation.PathVariable;
/*     */ import org.springframework.web.bind.annotation.PostMapping;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/niu/site"})
/*     */ public class SiteController
/*     */ {
/*     */   @Autowired
/*     */   private SiteService siteService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:site:site"})
/*     */   String Site()
/*     */   {
/*  46 */     return "niu/site/site";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:site:site"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  54 */     Query query = new Query(params);
/*  55 */     List<SiteDO> siteList = this.siteService.list(query);
/*  56 */     int total = this.siteService.count(query);
/*  57 */     PageUtils pageUtils = new PageUtils(siteList, total);
/*  58 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:site:add"})
/*     */   String add() {
/*  64 */     return "niu/site/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:site:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  70 */     SiteDO site = this.siteService.get(id);
/*  71 */     model.addAttribute("site", site);
/*  72 */     return "niu/site/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:site:add"})
/*     */   public R save(SiteDO site)
/*     */   {
/*  82 */     if (this.siteService.save(site) > 0) {
/*  83 */       return R.ok();
/*     */     }
/*  85 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:site:edit"})
/*     */   public R update(SiteDO site)
/*     */   {
/*  94 */     this.siteService.update(site);
/*  95 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:site:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 105 */     if (this.siteService.remove(id) > 0) {
/* 106 */       return R.ok();
/*     */     }
/* 108 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:site:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 118 */     this.siteService.batchRemove(ids);
/* 119 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/siteUpdate"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:site:siteUpdate"})
/*     */   public R siteUpdate()
/*     */   {
/* 129 */     String success = "false";
/* 130 */     ArrayList<String> rrayList = new ArrayList();
/*     */     
/* 132 */     CityUtil cityUtil = new CityUtil();
/*     */     try
/*     */     {
/* 135 */       this.siteService.removeAll();
/* 136 */       rrayList = cityUtil.getCity();
/* 137 */       for (int i = 0; i < rrayList.size(); i++) {
/* 138 */         SiteDO siteDo = new SiteDO();
/* 139 */         siteDo.setSiteZw(((String)rrayList.get(i)).split("##")[0]);
/* 140 */         siteDo.setSiteDh(((String)rrayList.get(i)).split("##")[1]);
/* 141 */         siteDo.setSitePy(((String)rrayList.get(i)).split("##")[2]);
/* 142 */         siteDo.setSiteJx(((String)rrayList.get(i)).split("##")[3]);
/* 143 */         siteDo.setSiteCreatedate(new Date());
/* 144 */         this.siteService.save(siteDo);
/* 145 */         success = "true";
/*     */       }
/*     */     }
/*     */     catch (ClientProtocolException e)
/*     */     {
/* 150 */       success = "false";
/* 151 */       e.printStackTrace();
/*     */     }
/*     */     catch (IOException e) {
/* 154 */       success = "false";
/* 155 */       e.printStackTrace();
/*     */     }
/*     */     
/* 158 */     if (success.equals("true")) {
/* 159 */       return R.ok();
/*     */     }
/* 161 */     return R.error();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/SiteController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */