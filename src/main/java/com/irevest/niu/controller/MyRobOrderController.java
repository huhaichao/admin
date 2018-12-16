/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.niu.OrderStatusEnum;
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.common.utils.ShiroUtils;
/*     */ import com.irevest.niu.domain.MyOrderDO;
/*     */ import com.irevest.niu.domain.RobOrderDO;
/*     */ import com.irevest.niu.service.MyOrderService;
/*     */ import com.irevest.niu.service.RobOrderService;
/*     */ import com.irevest.niu.service.TicketOrderService;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.shiro.authz.annotation.RequiresPermissions;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.ui.Model;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
/*     */ import org.springframework.web.bind.annotation.PathVariable;
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
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/niu/myRobOrder"})
/*     */ public class MyRobOrderController
/*     */ {
/*     */   @Autowired
/*     */   private RobOrderService robOrderService;
/*     */   @Autowired
/*     */   private MyOrderService myOrderService;
/*     */   @Autowired
/*     */   private TicketOrderService ticketOrderService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:myRobOrder:myRobOrder"})
/*     */   String RobOrder()
/*     */   {
/*  53 */     return "niu/myRobOrder/myRobOrder";
/*     */   }
/*     */   
/*     */   @GetMapping({"/myDelRobOrder"})
/*     */   @RequiresPermissions({"niu:myRobOrder:myDelRobOrder"})
/*  58 */   String DelRobOrder() { return "niu/myRobOrder/myDelRobOrder"; }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:myRobOrder:myRobOrder"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  65 */     params.put("userId", ShiroUtils.getUserId());
/*  66 */     params.put("robScbs", "0");
/*  67 */     Query query = new Query(params);
/*  68 */     List<MyOrderDO> myOrderList = this.myOrderService.selectTicketListRob(query);
/*  69 */     int total = this.robOrderService.count(query);
/*     */     
/*  71 */     PageUtils pageUtils = new PageUtils(getListMyOrderDO(myOrderList), total);
/*  72 */     return pageUtils;
/*     */   }
/*     */   
/*     */ 
/*     */   @ResponseBody
/*     */   @GetMapping({"/listDelOrder"})
/*     */   @RequiresPermissions({"niu:myRobOrder:myDelRobOrder"})
/*     */   public PageUtils listDelOrder(@RequestParam Map<String, Object> params)
/*     */   {
/*  81 */     params.put("userId", ShiroUtils.getUserId());
/*  82 */     params.put("robScbs", "1");
/*  83 */     Query query = new Query(params);
/*  84 */     List<MyOrderDO> myOrderList = this.myOrderService.selectTicketListRobDel(query);
/*  85 */     int total = this.robOrderService.count(query);
/*     */     
/*  87 */     PageUtils pageUtils = new PageUtils(getListMyOrderDO(myOrderList), total);
/*  88 */     return pageUtils;
/*     */   }
/*     */   
/*     */   @GetMapping({"/add"})
/*     */   @RequiresPermissions({"niu:myRobOrder:add"})
/*     */   String add() {
/*  94 */     return "niu/myRobOrder/add";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   @GetMapping({"/myEdit/{orderNo}"})
/*     */   @RequiresPermissions({"niu:myRobOrder:myEdit"})
/*     */   String myEdit(@PathVariable("orderNo") String orderNo, Model model)
/*     */   {
/* 103 */     model.addAttribute("orderNo", orderNo);
/* 104 */     return "niu/myRobOrder/myEdit";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/update"})
/*     */   public R update(RobOrderDO robOrderDo)
/*     */   {
/* 114 */     String orderId = robOrderDo.getOrderId();
/* 115 */     String context = robOrderDo.getRobContext();
/* 116 */     RobOrderDO robOrder = this.robOrderService.getEntity(orderId, ShiroUtils.getUserId().toString());
/* 117 */     if (this.robOrderService.getCheckcount(orderId) > 0) {
/* 118 */       return R.error(1, "订单：" + orderId + "已经被其他商户提交,暂时无法提交！");
/*     */     }
/* 120 */     robOrder.setRobContext(context);
/* 121 */     robOrder.setRobStatus(OrderStatusEnum.ROB_CHECK.getStatus());
/*     */     
/* 123 */     this.robOrderService.update(robOrder);
/*     */     
/* 125 */     List<RobOrderDO> robOrders = this.robOrderService.getEntitys(orderId);
/*     */     
/* 127 */     for (int i = 0; i < robOrders.size(); i++) {
/* 128 */       if (((RobOrderDO)robOrders.get(i)).getUserId().intValue() != ShiroUtils.getUserId().intValue()) {
/* 129 */         ((RobOrderDO)robOrders.get(i)).setRobStatus(OrderStatusEnum.ROB_LOCK.getStatus());
/*     */         
/* 131 */         this.robOrderService.update((RobOrderDO)robOrders.get(i));
/*     */       }
/*     */     }
/*     */     
/* 135 */     return R.ok("提交成功！");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/del"})
/*     */   public R removeOr(String orderNo, String id)
/*     */   {
/* 150 */     Map<String, Object> params = new HashMap();
/* 151 */     params.put("offset", Integer.valueOf(1));
/* 152 */     params.put("limit", Integer.valueOf(10));
/* 153 */     params.put("orderId", orderNo);
/* 154 */     Query query = new Query(params);
/* 155 */     String userId = ShiroUtils.getUserId().toString();
/*     */     
/* 157 */     RobOrderDO robOrderDo = this.robOrderService.get(Integer.valueOf(Integer.parseInt(id)));
/*     */     
/*     */ 
/* 160 */     robOrderDo.setRobScbs(Integer.valueOf(1));
/* 161 */     if (this.robOrderService.update(robOrderDo) > 0)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       return R.ok("删除陈功！");
/*     */     }
/* 171 */     return R.error("删除失败！");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/delOrder"})
/*     */   public R removeOrder(String orderNo, String id)
/*     */   {
/* 184 */     Map<String, Object> params = new HashMap();
/* 185 */     params.put("offset", Integer.valueOf(1));
/* 186 */     params.put("limit", Integer.valueOf(10));
/* 187 */     params.put("orderId", orderNo);
/* 188 */     Query query = new Query(params);
/* 189 */     String userId = ShiroUtils.getUserId().toString();
/*     */     
/* 191 */     RobOrderDO robOrderDo = this.robOrderService.get(Integer.valueOf(Integer.parseInt(id)));
/*     */     
/*     */ 
/* 194 */     robOrderDo.setRobScbs(Integer.valueOf(0));
/* 195 */     if (this.robOrderService.update(robOrderDo) > 0)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */       return R.ok("恢复陈功！");
/*     */     }
/* 205 */     return R.error("恢复失败！");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<MyOrderDO> getListMyOrderDO(List<MyOrderDO> ticketOrderList)
/*     */   {
/* 214 */     StringBuffer dateBufer = new StringBuffer();
/*     */     
/* 216 */     StringBuffer amountBufer = new StringBuffer();
/*     */     
/* 218 */     for (int i = 0; i < ticketOrderList.size(); i++) {
/* 219 */       dateBufer.setLength(0);
/* 220 */       amountBufer.setLength(0);
/*     */       
/* 222 */       String[] train = ((MyOrderDO)ticketOrderList.get(i)).getTrainNum().split(",");
/*     */       
/* 224 */       String[] date = ((MyOrderDO)ticketOrderList.get(i)).getDepartureDate().split(",");
/*     */       
/* 226 */       String[] amount = ((MyOrderDO)ticketOrderList.get(i)).getSeatType().split(",");
/*     */       
/* 228 */       for (int j = 0; j < train.length; j++) {
/* 229 */         dateBufer.append(date[j] + "【" + train[j] + "】").append(",");
/* 230 */         amountBufer.append(amount[j] + "【" + train[j] + "】").append(",");
/*     */       }
/* 232 */       ((MyOrderDO)ticketOrderList.get(i)).setDepartureDate(dateBufer.toString().substring(0, dateBufer.length() - 1));
/* 233 */       ((MyOrderDO)ticketOrderList.get(i)).setSeatType(amountBufer.toString().substring(0, amountBufer.length() - 1));
/*     */     }
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
/*     */ 
/* 260 */     return ticketOrderList;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/MyRobOrderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */