/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.RobOrderDO;
/*     */ import com.irevest.niu.service.RobOrderService;
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
/*     */ 
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/niu/robOrder"})
/*     */ public class RobOrderController
/*     */ {
/*     */   @Autowired
/*     */   private RobOrderService robOrderService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:robOrder:robOrder"})
/*     */   String RobOrder()
/*     */   {
/*  43 */     return "niu/robOrder/robOrder";
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:robOrder:robOrder"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  52 */     Query query = new Query(params);
/*  53 */     List<RobOrderDO> robOrderList = this.robOrderService.list(query);
/*  54 */     int total = this.robOrderService.count(query);
/*  55 */     PageUtils pageUtils = new PageUtils(robOrderList, total);
/*  56 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:robOrder:add"})
/*     */   String add() {
/*  62 */     return "niu/robOrder/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:robOrder:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  68 */     RobOrderDO robOrder = this.robOrderService.get(id);
/*  69 */     model.addAttribute("robOrder", robOrder);
/*  70 */     return "niu/robOrder/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:robOrder:add"})
/*     */   public R save(RobOrderDO robOrder)
/*     */   {
/*  80 */     if (this.robOrderService.save(robOrder) > 0) {
/*  81 */       return R.ok();
/*     */     }
/*  83 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:robOrder:edit"})
/*     */   public R update(RobOrderDO robOrder)
/*     */   {
/*  92 */     this.robOrderService.update(robOrder);
/*  93 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:robOrder:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 103 */     if (this.robOrderService.remove(id) > 0) {
/* 104 */       return R.ok();
/*     */     }
/* 106 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:robOrder:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 116 */     this.robOrderService.batchRemove(ids);
/* 117 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/RobOrderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */