/*     */ package com.irevest.niu.controller;
/*     */ 
/*     */ import com.irevest.common.niu.OrderStatusEnum;
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.common.utils.ShiroUtils;
/*     */ import com.irevest.niu.domain.MyOrderDO;
/*     */ import com.irevest.niu.domain.RobOrderDO;
/*     */ import com.irevest.niu.domain.TicketOrderDO;
/*     */ import com.irevest.niu.service.MyOrderService;
/*     */ import com.irevest.niu.service.RobOrderService;
/*     */ import com.irevest.niu.service.TicketOrderService;
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.shiro.authz.annotation.RequiresPermissions;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
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
/*     */ @RequestMapping({"/niu/myOrder"})
/*     */ public class MyOrderController
/*     */ {
/*     */   @Autowired
/*     */   private RobOrderService robOrderService;
/*     */   @Autowired
/*     */   private MyOrderService myOrderService;
/*     */   @Autowired
/*     */   private TicketOrderService ticketOrderService;
/*     */   
/*     */   @GetMapping
/*     */   @RequiresPermissions({"niu:myOrder:myOrder"})
/*     */   String RobOrder()
/*     */   {
/*  52 */     return "niu/myOrder/myOrder";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @GetMapping({"/list"})
/*     */   @RequiresPermissions({"niu:myOrder:myOrder"})
/*     */   public PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
	
/*  60 */     List<MyOrderDO> ticketOrderList = new ArrayList();
              params.put("userId", Integer.valueOf(ShiroUtils.getUserId().intValue()));
/*  61 */     Query query = new Query(params);
              
/*  62 */     ticketOrderList = this.myOrderService.selectTicketList(query);
/*  63 */     //System.out.println(ticketOrderList.size());
/*  64 */     int total = ticketOrderList.size();
/*  65 */     PageUtils pageUtils = new PageUtils(getListMyOrderDO(ticketOrderList), total);
/*  66 */     return pageUtils;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @ResponseBody
/*     */   @RequestMapping({"/jd"})
/*     */   public R addJd(String orderNo, String userId, String orderStatus, String id)
/*     */   {
/*  77 */     RobOrderDO robOrderDO = new RobOrderDO();
/*  78 */     TicketOrderDO ticketOrder = this.ticketOrderService.get(Integer.valueOf(Integer.parseInt(id)));
/*  79 */     Map<String, Object> params = new HashMap();
/*  80 */     params.put("offset", Integer.valueOf(1));
/*  81 */     params.put("limit", Integer.valueOf(10));
/*  82 */     params.put("orderId", orderNo);
/*  83 */     params.put("userId", Integer.valueOf(ShiroUtils.getUserId().intValue()));
/*  84 */     Query query = new Query(params);
/*  85 */     int count = this.robOrderService.count(query);
/*  86 */     if (count >= 1) {
/*  87 */       return R.error("订单：" + orderNo + "已经接过,请勿重复接单！");
/*     */     }
/*     */     
/*  90 */     if (this.robOrderService.getCheckcount(orderNo) > 0) {
/*  91 */       return R.error(1, "订单：" + orderNo + "已经被其他商户提交,暂时无法接单！");
/*     */     }
/*  93 */     robOrderDO.setUserId(Integer.valueOf(ShiroUtils.getUserId().intValue()));
/*  94 */     robOrderDO.setRobStatus(OrderStatusEnum.ROBING.getStatus());
/*  95 */     robOrderDO.setCreateDate(new Date());
/*  96 */     robOrderDO.setOrderId(orderNo);
/*  97 */     robOrderDO.setRobScbs(Integer.valueOf(0));
/*  98 */     robOrderDO.setRobAmount(Double.valueOf(ticketOrder.getOrderAmount().doubleValue() * 0.8D));
/*  99 */     this.robOrderService.save(robOrderDO);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */     if (this.ticketOrderService.get(Integer.valueOf(Integer.parseInt(id))).getOrderStatus().equals("wait_rob"))
/*     */     {
/* 107 */       ticketOrder.setOrderStatus("robing");
/* 108 */       this.ticketOrderService.update(ticketOrder);
/*     */     }
/* 110 */     return R.ok("接单成功！");
/*     */   }
/*     */   
/*     */ 
/*     */   public List<MyOrderDO> getListMyOrderDO(List<MyOrderDO> ticketOrderList)
/*     */   {
/* 116 */     StringBuffer dateBufer = new StringBuffer();
/*     */     
/* 118 */     StringBuffer amountBufer = new StringBuffer();
/*     */     
/* 120 */     for (int i = 0; i < ticketOrderList.size(); i++) {
/* 121 */       dateBufer.setLength(0);
/* 122 */       amountBufer.setLength(0);
/*     */       
/* 124 */       String[] train = ((MyOrderDO)ticketOrderList.get(i)).getTrainNum().split(",");
/*     */       
/* 126 */       String[] date = ((MyOrderDO)ticketOrderList.get(i)).getDepartureDate().split(",");
/*     */       
/* 128 */       String[] amount = ((MyOrderDO)ticketOrderList.get(i)).getSeatType().split(",");
/*     */       
/* 130 */       for (int j = 0; j < train.length; j++) {
/* 131 */         dateBufer.append(date[j] + "【" + train[j] + "】").append(",");
/* 132 */         amountBufer.append(amount[j] + "【" + train[j] + "】").append(",");
/*     */       }
/* 134 */       ((MyOrderDO)ticketOrderList.get(i)).setDepartureDate(dateBufer.toString().substring(0, dateBufer.length() - 1));
/* 135 */       ((MyOrderDO)ticketOrderList.get(i)).setSeatType(amountBufer.toString().substring(0, amountBufer.length() - 1));
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
/* 162 */     return ticketOrderList;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/controller/MyOrderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */