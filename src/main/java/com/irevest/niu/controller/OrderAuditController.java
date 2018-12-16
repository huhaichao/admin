/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.OrderAuditDO;
/*     */ import com.irevest.niu.service.OrderAuditService;
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
/*     */ @RequestMapping({"/niu/orderAudit"})
/*     */ public class OrderAuditController
/*     */ {
/*     */   @Autowired
/*     */   private OrderAuditService orderAuditService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:orderAudit:orderAudit"})
/*     */   String OrderAudit()
/*     */   {
/*  41 */     return "niu/orderAudit/orderAudit";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:orderAudit:orderAudit"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<OrderAuditDO> orderAuditList = this.orderAuditService.list(query);
/*  51 */     int total = this.orderAuditService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(orderAuditList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:orderAudit:add"})
/*     */   String add() {
/*  59 */     return "niu/orderAudit/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:orderAudit:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     OrderAuditDO orderAudit = this.orderAuditService.get(id);
/*  66 */     model.addAttribute("orderAudit", orderAudit);
/*  67 */     return "niu/orderAudit/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:orderAudit:add"})
/*     */   public R save(OrderAuditDO orderAudit)
/*     */   {
/*  77 */     if (this.orderAuditService.save(orderAudit) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:orderAudit:edit"})
/*     */   public R update(OrderAuditDO orderAudit)
/*     */   {
/*  89 */     this.orderAuditService.update(orderAudit);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:orderAudit:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.orderAuditService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:orderAudit:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.orderAuditService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/OrderAuditController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */