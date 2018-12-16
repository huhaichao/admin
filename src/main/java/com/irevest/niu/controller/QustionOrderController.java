package com.irevest.niu.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.irevest.niu.domain.QustionOrderDO;
import com.irevest.niu.service.QustionOrderService;
import com.irevest.common.utils.PageUtils;
import com.irevest.common.utils.Query;
import com.irevest.common.utils.R;

/**
 * 问题订单表
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-13 16:11:52
 */
 
@Controller
@RequestMapping("/niu/qustionOrder")
public class QustionOrderController {
	@Autowired
	private QustionOrderService qustionOrderService;
	
	@GetMapping()
	@RequiresPermissions("niu:qustionOrder:qustionOrder")
	String QustionOrder(){
	    return "niu/qustionOrder/qustionOrder";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("niu:qustionOrder:qustionOrder")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<QustionOrderDO> qustionOrderList = qustionOrderService.list(query);
		int total = qustionOrderService.count(query);
		PageUtils pageUtils = new PageUtils(qustionOrderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("niu:qustionOrder:add")
	String add(){
	    return "niu/qustionOrder/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("niu:qustionOrder:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		QustionOrderDO qustionOrder = qustionOrderService.get(id);
		Timestamp createDate = new Timestamp(qustionOrder.getCreateDate().getTime());
	    Timestamp modifyDate = new Timestamp(qustionOrder.getModifyDate().getTime());
	    qustionOrder.setCreateDate(createDate);
	    qustionOrder.setModifyDate(modifyDate);
		model.addAttribute("qustionOrder", qustionOrder);
	    return "niu/qustionOrder/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("niu:qustionOrder:add")
	public R save( QustionOrderDO qustionOrder){
		if(qustionOrderService.save(qustionOrder)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("niu:qustionOrder:edit")
	public R update( QustionOrderDO qustionOrder){
		qustionOrderService.update(qustionOrder);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("niu:qustionOrder:remove")
	public R remove( Integer id){
		if(qustionOrderService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("niu:qustionOrder:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		qustionOrderService.batchRemove(ids);
		return R.ok();
	}
	
}
