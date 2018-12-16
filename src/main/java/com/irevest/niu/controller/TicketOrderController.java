/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.TicketOrderDO;
/*     */ import com.irevest.niu.service.TicketOrderService;
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
/*     */ @RequestMapping({"/niu/ticketOrder"})
/*     */ public class TicketOrderController
/*     */ {
/*     */   @Autowired
/*     */   private TicketOrderService ticketOrderService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:ticketOrder:ticketOrder"})
/*     */   String TicketOrder()
/*     */   {
/*  41 */     return "niu/ticketOrder/ticketOrder";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:ticketOrder:ticketOrder"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<TicketOrderDO> ticketOrderList = this.ticketOrderService.list(query);
/*  51 */     int total = this.ticketOrderService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(ticketOrderList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:ticketOrder:add"})
/*     */   String add() {
/*  59 */     return "niu/ticketOrder/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:ticketOrder:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     TicketOrderDO ticketOrder = this.ticketOrderService.get(id);
/*  66 */     model.addAttribute("ticketOrder", ticketOrder);
/*  67 */     return "niu/ticketOrder/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:ticketOrder:add"})
/*     */   public R save(TicketOrderDO ticketOrder)
/*     */   {
/*  77 */     if (this.ticketOrderService.save(ticketOrder) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:ticketOrder:edit"})
/*     */   public R update(TicketOrderDO ticketOrder)
/*     */   {
/*  89 */     this.ticketOrderService.update(ticketOrder);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:ticketOrder:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.ticketOrderService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:ticketOrder:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.ticketOrderService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/TicketOrderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */