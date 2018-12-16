/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.UserBackDO;
/*     */ import com.irevest.niu.service.UserBackService;
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
/*     */ @RequestMapping({"/niu/userBack"})
/*     */ public class UserBackController
/*     */ {
/*     */   @Autowired
/*     */   private UserBackService userBackService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:userBack:userBack"})
/*     */   String UserBack()
/*     */   {
/*  41 */     return "niu/userBack/userBack";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:userBack:userBack"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<UserBackDO> userBackList = this.userBackService.list(query);
/*  51 */     int total = this.userBackService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(userBackList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:userBack:add"})
/*     */   String add() {
/*  59 */     return "niu/userBack/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:userBack:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     UserBackDO userBack = this.userBackService.get(id);
/*  66 */     model.addAttribute("userBack", userBack);
/*  67 */     return "niu/userBack/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:userBack:add"})
/*     */   public R save(UserBackDO userBack)
/*     */   {
/*  77 */     if (this.userBackService.save(userBack) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:userBack:edit"})
/*     */   public R update(UserBackDO userBack)
/*     */   {
/*  89 */     this.userBackService.update(userBack);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userBack:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.userBackService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userBack:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.userBackService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/UserBackController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */