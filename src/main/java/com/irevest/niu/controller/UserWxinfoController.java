/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.UserWxinfoDO;
/*     */ import com.irevest.niu.service.UserWxinfoService;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ @RequestMapping({"/niu/userWxinfo"})
/*     */ public class UserWxinfoController
/*     */ {
/*     */   @Autowired
/*     */   private UserWxinfoService userWxinfoService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:userWxinfo:userWxinfo"})
/*     */   String UserWxinfo()
/*     */   {
/*  41 */     return "niu/userWxinfo/userWxinfo";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:userWxinfo:userWxinfo"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<UserWxinfoDO> userWxinfoList = this.userWxinfoService.list(query);
/*  51 */     int total = this.userWxinfoService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(userWxinfoList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:userWxinfo:add"})
/*     */   String add() {
/*  59 */     return "niu/userWxinfo/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:userWxinfo:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     UserWxinfoDO userWxinfo = this.userWxinfoService.get(id);
/*  66 */     model.addAttribute("userWxinfo", userWxinfo);
/*  67 */     return "niu/userWxinfo/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:userWxinfo:add"})
/*     */   public R save(UserWxinfoDO userWxinfo)
/*     */   {
/*  77 */     if (this.userWxinfoService.save(userWxinfo) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:userWxinfo:edit"})
/*     */   public R update(UserWxinfoDO userWxinfo)
/*     */   {
/*  89 */     this.userWxinfoService.update(userWxinfo);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userWxinfo:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.userWxinfoService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userWxinfo:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.userWxinfoService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/UserWxinfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */