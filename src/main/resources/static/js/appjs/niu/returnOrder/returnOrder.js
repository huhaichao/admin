
var prefix = "/niu/returnOrder"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : true, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset,
								returnNo:$('#searchName').val(),
								orderNo:$('#searchName1').val()
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'id', 
									title : '' 
								},
																{
									field : 'userId', 
									title : '用户id',
									visible: false
								},
																{
									field : 'returnNo', 
									title : '退单号' 
								},
																{
									field : 'orderNo', 
									title : '订单号' 
								},
								
								{
									field : 'depositNo', 
									title : '充值单号' 
								},
								
								{
									field : 'tradeChannelsNo', 
									title : '第三订单号',
									visible: false
								},
																{
									field : 'tradeChannelsReturnNo', 
									title : '第三方退款单号' ,
									visible: false
								},
																{
									field : 'returnAmount', 
									title : '退款金额' 
								},
																{
									field : 'orderAmount', 
									title : '订单金额' 
								},
																{
									field : 'returnStatus', 
									title : '退款状态',
									align : 'center',
									formatter : function(value, row, index) {
										    //alert("返回的值是:"+value);
											if (value == 'returned_audit') {
												return '<span class="label label-warning">退款审核中</span>';
											} else if (value == 'returned_amount') {
												return '<span class="label label-primary">退款成功</span>';
											}else if(value == 'returned_return'){
												return '<span class="label label-danger">驳回申请</span>';
											}else if(value == 'returning_channels'){
												return '<span class="label label-warning">支付通道退款中</span>';
											}else if(value == 'returned_amount_fail'){
												return '<span class="label label-warning">退款失败</span>';
											}
										}
								},
																{
									field : 'returnType', 
									title : '退款类型' 
								},
																{
									field : 'createDate', 
									title : '退款时间' 
								},
																{
									field : 'modifyDate', 
									title : '修改时间' ,
									visible: false
								},
																{
									field : 'retunTime', 
									title : '退款完成时间' ,
									visible: false
								},
																{
									field : 'remark', 
									title : '备注' ,
									visible: false
								},
																{
									field : 'appcode', 
									title : 'app代码' ,
									visible: false
								},
																{
									field : 'refundAccount', 
									title : '退款资金来源' ,
									visible: false
								},
																{
									field : 'refundRequestSource', 
									title : '退款发起来源' ,
									visible: false
								},
																{
									field : 'refundRecvAccout', 
									title : '退款入账账户' 
								},
																{
									title : '操作',
									//field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										//returning_amount 审核通过,returned_return 审核不通过
										if(row.returnStatus=='returned_amount' || row.returnStatus=='returning_channels'){
											
											var g='';
											var h='';
											var h = '<a class="btn btn-primary btn-sm  href="#" mce_href="#" title="结束" disabled="disabled"><i class="#">结束</i></a> ';	
										}else if(row.returnStatus=='returned_return'){
											var g = '<a class="btn btn-primary btn-sm '+s_check_h+'" href="#" mce_href="#" title="复核同意退款" onclick="check(\''
											+ row.id
											+ '\')"><i class="#">复核</i></a> ';										
									        var h = '';												
										}else if(row.returnStatus=='returned_audit'){
											var g = '<a class="btn btn-primary btn-sm '+s_check_h+'" href="#" mce_href="#" title="同意退款" onclick="check(\''
											+ row.id
											+ '\')"><i class="#">同意</i></a> ';										
											var h = '<a class="btn btn-danger btn-sm '+s_break_h+'" href="#" title="驳回退款"  mce_href="#" onclick="bh(\''
													+ row.id
													+ '\')"><i class="#">驳回</i></a> ';												
											
										}else{
											var g='';
											var h='';
											var h = '<a class="btn btn-primary btn-sm  href="#" mce_href="#" title="审核中" disabled="disabled"><i class="#">审核中...</i></a> ';	
										}
											var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
													+ row.id
													+ '\')"><i class="fa fa-edit"></i></a> ';
											var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
													+ row.id
													+ '\')"><i class="fa fa-remove"></i></a> ';
											var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
													+ row.id
													+ '\')"><i class="fa fa-key"></i></a> ';
	
											return e + g + h ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
	//load();
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'id' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['id'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});	
	
}


//同意退票
function check(id) {
	layer.confirm('确定要通过退票审核？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/check",
			type : "post",
			data : {
				'id' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})}
//驳回退票申请
function bh(id) {

	layer.open({
		type : 2,
		title : '驳回理由',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/bhcheck/' + id // iframe的url
	});
	

}