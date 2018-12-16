/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.ReturnOrderDO;
/*     */ import com.irevest.niu.service.ReturnOrderService;
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
/*     */ @RequestMapping({"/niu/returnOrder"})
/*     */ public class ReturnOrderController
/*     */ {
/*     */   @Autowired
/*     */   private ReturnOrderService returnOrderService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:returnOrder:returnOrder"})
/*     */   String ReturnOrder()
/*     */   {
/*  41 */     return "niu/returnOrder/returnOrder";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:returnOrder:returnOrder"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<ReturnOrderDO> returnOrderList = this.returnOrderService.list(query);
/*  51 */     int total = this.returnOrderService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(returnOrderList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:returnOrder:add"})
/*     */   String add() {
/*  59 */     return "niu/returnOrder/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:returnOrder:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     ReturnOrderDO returnOrder = this.returnOrderService.get(id);
/*  66 */     model.addAttribute("returnOrder", returnOrder);
/*  67 */     return "niu/returnOrder/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:returnOrder:add"})
/*     */   public R save(ReturnOrderDO returnOrder)
/*     */   {
/*  77 */     if (this.returnOrderService.save(returnOrder) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:returnOrder:edit"})
/*     */   public R update(ReturnOrderDO returnOrder)
/*     */   {
/*  89 */     this.returnOrderService.update(returnOrder);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:returnOrder:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.returnOrderService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:returnOrder:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.returnOrderService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/check"})
/*     */   @ResponseBody
/*     */   public R check(Integer id)
/*     */   {
/* 124 */     ReturnOrderDO returnOrder = this.returnOrderService.get(id);
/*     */     
/* 126 */     returnOrder.setReturnStatus("returning_amount");
/* 127 */     this.returnOrderService.update(returnOrder);
/* 128 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/bhcheck"})
/*     */   @RequiresPermissions({"niu:returnOrder:break"})
/*     */   public R bhcheck(ReturnOrderDO returnOrder)
/*     */   {
/* 139 */     returnOrder.setReturnStatus("returned_return");
/* 140 */     this.returnOrderService.update(returnOrder);
/* 141 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/bhcheck/{id}"})
/*     */   @RequiresPermissions({"niu:returnOrder:break"})
/*     */   String bhcheck(@PathVariable("id") Integer id, Model model)
/*     */   {
/* 153 */     ReturnOrderDO returnOrder = this.returnOrderService.get(id);
/* 154 */     model.addAttribute("returnOrder", returnOrder);
/* 155 */     return "niu/returnOrder/bhcheck";
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/ReturnOrderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */