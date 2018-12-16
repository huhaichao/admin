/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.NiuNotifyDO;
/*     */ import com.irevest.niu.service.NiuNotifyService;
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
/*     */ @RequestMapping({"/niu/notify"})
/*     */ public class NuiNotifyController
/*     */ {
/*     */   @Autowired
/*     */   private NiuNotifyService niuNotifyService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:notify:notify"})
/*     */   String Notify()
/*     */   {
/*  41 */     return "niu/notify/notify";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:notify:notify"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<NiuNotifyDO> notifyList = this.niuNotifyService.list(query);
/*  51 */     int total = this.niuNotifyService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(notifyList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:notify:add"})
/*     */   String add() {
/*  59 */     return "niu/notify/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:notify:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     NiuNotifyDO notify = this.niuNotifyService.get(id);
/*  66 */     model.addAttribute("notify", notify);
/*  67 */     return "niu/notify/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:notify:add"})
/*     */   public R save(NiuNotifyDO notify)
/*     */   {
/*  77 */     if (this.niuNotifyService.save(notify) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:notify:edit"})
/*     */   public R update(NiuNotifyDO notify)
/*     */   {
/*  89 */     this.niuNotifyService.update(notify);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:notify:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.niuNotifyService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:notify:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.niuNotifyService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/NuiNotifyController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */