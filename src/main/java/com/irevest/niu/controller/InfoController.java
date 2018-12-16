/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.InfoDO;
/*     */ import com.irevest.niu.service.InfoService;
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
/*     */ @RequestMapping({"/niu/info"})
/*     */ public class InfoController
/*     */ {
/*     */   @Autowired
/*     */   private InfoService infoService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:info:info"})
/*     */   String Info()
/*     */   {
/*  41 */     return "niu/info/info";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:info:info"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  49 */     Query query = new Query(params);
/*  50 */     List<InfoDO> infoList = this.infoService.list(query);
/*  51 */     int total = this.infoService.count(query);
/*  52 */     PageUtils pageUtils = new PageUtils(infoList, total);
/*  53 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:info:add"})
/*     */   String add() {
/*  59 */     return "niu/info/add";
/*     */   }
/*     */   
/*     */   @GetMapping({"/edit/{id}"})
/*     */   @RequiresPermissions({"niu:info:edit"})
/*     */   String edit(@PathVariable("id") Integer id, Model model) {
/*  65 */     InfoDO info = this.infoService.get(id);
/*  66 */     model.addAttribute("info", info);
/*  67 */     return "niu/info/edit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @PostMapping({"/save"})
/*     */   @RequiresPermissions({"niu:info:add"})
/*     */   public R save(InfoDO info)
/*     */   {
/*  77 */     if (this.infoService.save(info) > 0) {
/*  78 */       return R.ok();
/*     */     }
/*  80 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   @RequiresPermissions({"niu:info:edit"})
/*     */   public R update(InfoDO info)
/*     */   {
/*  89 */     this.infoService.update(info);
/*  90 */     return R.ok();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:info:remove"})
/*     */   public R remove(Integer id)
/*     */   {
/* 100 */     if (this.infoService.remove(id) > 0) {
/* 101 */       return R.ok();
/*     */     }
/* 103 */     return R.error();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   @RequiresPermissions({"niu:info:batchRemove"})
/*     */   public R remove(@RequestParam("ids[]") Integer[] ids)
/*     */   {
/* 113 */     this.infoService.batchRemove(ids);
/* 114 */     return R.ok();
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/InfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */