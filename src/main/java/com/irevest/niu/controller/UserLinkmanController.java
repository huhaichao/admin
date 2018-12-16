/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.UserLinkmanDO;
/*     */ import com.irevest.niu.service.UserLinkmanService;
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
/*     */ @RequestMapping({"/niu/userLinkman"})
/*     */ public class UserLinkmanController
/*     */ {
/*     */   @Autowired
/*     */   private UserLinkmanService userLinkmanService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:userLinkman:userLinkman"})
/*     */   String UserLinkman()
/*     */   {
/*  41 */     return "niu/userLinkman/userLinkman";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:userLinkman:userLinkman"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<UserLinkmanDO> userLinkmanList = this.userLinkmanService.list(query);
/*  51 */     int total = this.userLinkmanService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(userLinkmanList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:userLinkman:add"})
/*     */   String add() {
/*  59 */     return "niu/userLinkman/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:userLinkman:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     UserLinkmanDO userLinkman = this.userLinkmanService.get(id);
/*  66 */     model.addAttribute("userLinkman", userLinkman);
/*  67 */     return "niu/userLinkman/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:userLinkman:add"})
/*     */   public R save(UserLinkmanDO userLinkman)
/*     */   {
/*  77 */     if (this.userLinkmanService.save(userLinkman) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:userLinkman:edit"})
/*     */   public R update(UserLinkmanDO userLinkman)
/*     */   {
/*  89 */     this.userLinkmanService.update(userLinkman);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userLinkman:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.userLinkmanService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userLinkman:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.userLinkmanService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/UserLinkmanController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */