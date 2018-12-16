/*    */ package com.irevest.common.niu;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum OrderStatusEnum
/*    */ {
/*  8 */   WAITPAY("wait_pay", "等待支付"), 
/*  9 */   WAITROB("wait_rob", "等待抢单"), 
/* 10 */   CANCEL("cancel", "订单取消"), 
/* 11 */   RETURNING_AMOUNT("returning_amount", "退款中"), 
/* 12 */   RETURNING_CHANNELS("returning_channels", "第三放支付通道退款中"), 
/* 13 */   RETURNED_AMOUNT("returned_amount", "已退款"), 
/* 14 */   RETURNED_AUDIT("returned_audit", "退款审核中"), 
/* 15 */   RETURNED_AMOUNT_FAIL("returned_amount_fail", "退款失败--具体原因看备注"), 
/* 16 */   RETURNED_RETURN("returned_return", "退款审核驳回,在备注中写明驳回原因"), 
/* 17 */   ROBING("robing", "抢票中"), 
/* 18 */   ORDER_AUDIT("order_audit", "出票审核中"), 
/* 19 */   TICKET_SUCCESS("ticket_success", "已出票"), 
/* 20 */   USER_PAY("user_pay", "用户付款中"), 
/* 21 */   SUCCESS("success", "已完成"), 
/* 22 */   ROB_FAIL("rob_fail", "抢单失败"), 
/* 23 */   WAITCONFIRME("wait_confirme", "等待确认"), 
/* 24 */   RETURN("return", "退票中"), 
/* 25 */   RETURN_SUCCESS("return_success", "退票完成"), 
/* 26 */   RETURN_FAIL("return_fail", "退票失败"), 
/* 27 */   ROB_CHECK("rob_check", "订单审核中"), 
/* 28 */   ROB_LOCK("rob_lock", "订单已锁定");
/*    */   
/*    */ 
/*    */   private String status;
/*    */   
/*    */   private String desc;
/*    */   
/*    */ 
/*    */   private OrderStatusEnum(String status, String desc)
/*    */   {
/* 38 */     this.status = status;
/* 39 */     this.desc = desc;
/*    */   }
/*    */   
/*    */   public String getStatus() {
/* 43 */     return this.status;
/*    */   }
/*    */   
/*    */   public String getDesc() {
/* 47 */     return this.desc;
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/common/niu/OrderStatusEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */