/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.UserDepositDO;
/*     */ import com.irevest.niu.service.UserDepositService;
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
/*     */ @RequestMapping({"/niu/userDeposit"})
/*     */ public class UserDepositController
/*     */ {
/*     */   @Autowired
/*     */   private UserDepositService userDepositService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:userDeposit:userDeposit"})
/*     */   String UserDeposit()
/*     */   {
/*  41 */     return "niu/userDeposit/userDeposit";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:userDeposit:userDeposit"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<UserDepositDO> userDepositList = this.userDepositService.list(query);
/*  51 */     int total = this.userDepositService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(userDepositList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:userDeposit:add"})
/*     */   String add() {
/*  59 */     return "niu/userDeposit/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:userDeposit:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     UserDepositDO userDeposit = this.userDepositService.get(id);
/*  66 */     model.addAttribute("userDeposit", userDeposit);
/*  67 */     return "niu/userDeposit/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:userDeposit:add"})
/*     */   public R save(UserDepositDO userDeposit)
/*     */   {
/*  77 */     if (this.userDepositService.save(userDeposit) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:userDeposit:edit"})
/*     */   public R update(UserDepositDO userDeposit)
/*     */   {
/*  89 */     this.userDepositService.update(userDeposit);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userDeposit:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.userDepositService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:userDeposit:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.userDepositService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/UserDepositController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */