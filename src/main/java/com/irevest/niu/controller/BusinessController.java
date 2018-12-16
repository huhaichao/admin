/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.BusinessDO;
/*     */ import com.irevest.niu.service.BusinessService;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Date;
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
/*     */ @RequestMapping({"/niu/business"})
/*     */ public class BusinessController
/*     */ {
/*     */   @Autowired
/*     */   private BusinessService businessService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:business:business"})
/*     */   String Business()
/*     */   {
/*  43 */     return "niu/business/business";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:business:business"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  51 */     Query query = new Query(params);
/*  52 */     List<BusinessDO> businessList = this.businessService.list(query);
/*  53 */     int total = this.businessService.count(query);
/*  54 */     PageUtils pageUtils = new PageUtils(businessList, total);
/*  55 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:business:add"})
/*     */   String add() {
/*  61 */     return "niu/business/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:business:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  67 */     BusinessDO business = this.businessService.get(id);
/*  68 */     Timestamp createDate = new Timestamp(business.getCreateDate().getTime());
/*  69 */     Timestamp modifyDate = new Timestamp(new Date().getTime());
/*  70 */     business.setModifyDate(modifyDate);
/*  71 */     business.setCreateDate(createDate);
/*  72 */     model.addAttribute("business", business);
/*  73 */     return "niu/business/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:business:add"})
/*     */   public R save(BusinessDO business)
/*     */   {
/*  83 */     if (this.businessService.save(business) > 0) {
/*  84 */       return R.ok();
/*     */     }
/*  86 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:business:edit"})
/*     */   public R update(BusinessDO business)
/*     */   {
/*  95 */     this.businessService.update(business);
/*  96 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:business:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 106 */     if (this.businessService.remove(id) > 0) {
/* 107 */       return R.ok();
/*     */     }
/* 109 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:business:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 119 */     this.businessService.batchRemove(ids);
/* 120 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/BusinessController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */