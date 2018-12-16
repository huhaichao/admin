/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.UserAccountDO;
/*     */ import com.irevest.niu.service.UserAccountService;
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
/*     */ @RequestMapping({"/niu/userAccount"})
/*     */ public class UserAccountController
/*     */ {
/*     */   @Autowired
/*     */   private UserAccountService userAccountService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:userAccount:userAccount"})
/*     */   String UserAccount()
/*     */   {
/*  41 */     return "niu/userAccount/userAccount";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:userAccount:userAccount"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<UserAccountDO> userAccountList = this.userAccountService.list(query);
/*  51 */     int total = this.userAccountService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(userAccountList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:userAccount:add"})
/*     */   String add() {
/*  59 */     return "niu/userAccount/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:userAccount:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     UserAccountDO userAccount = this.userAccountService.get(id);
/*  66 */     model.addAttribute("userAccount", userAccount);
/*  67 */     return "niu/userAccount/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:userAccount:add"})
/*     */   public R save(UserAccountDO userAccount)
/*     */   {
/*  77 */     if (this.userAccountService.save(userAccount) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:userAccount:edit"})
/*     */   public R update(UserAccountDO userAccount)
/*     */   {
/*  89 */     this.userAccountService.update(userAccount);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userAccount:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.userAccountService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userAccount:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.userAccountService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/UserAccountController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */