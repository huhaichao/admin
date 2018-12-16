
var prefix = "/niu/ticketOrder"
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
								orderNo:$('#searchName').val(),
								phoneNo:$('#searchName1').val()
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
									title : '' ,
									visible: false
								},
																{
									field : 'orderNo', 
									title : '订单号' 
								},
																{
									field : 'phoneNo', 
									title : '订单手机号' 
								},
																{
									field : 'userId', 
									title : '用户id' ,
									visible: false
								},
																{
									field : 'ticketIdentity', 
									title : '车票身份证号' 
								},
																{
									field : 'identityType', 
									title : '证件类型' ,
									visible: false
								},
																{
									field : 'ticketName', 
									title : '车票姓名' 
								},
																{
									field : 'linkmanType', 
									title : '乘车人类型' ,
									visible: false
								},
																{
									field : 'fromSite', 
									title : '出发地' 
								},
																{
									field : 'toSite', 
									title : '目的地' 
								},
																{
									field : 'departureDate', 
									title : '出发时间' ,
									visible: false
								},
																{
									field : 'trainNum', 
									title : '车次' ,
									visible: false
								},
																{
									field : 'seatType', 
									title : '席位' ,
									visible: false
								},
																{
									field : 'createDate', 
									title : '订单创建时间' 
								},

							    {
									field : 'orderStatus', 
									title : '订单状态',
									formatter : function(value, row, index) {
									    //alert("返回的值是:"+value);
										if (value == 'wait_rob') {
											return '等待支付';
										} else if (value == 'cancel') {
											return '订单取消';
										}else if(value == 'returning_amount'){
											return '退款中';
										}else if(value == 'returning_channels'){
											return '第三放支付通道退款中';
										}else if(value == 'returned_amount'){
											return '已退款';
										}else if(value == 'returned_audit'){
											return '退款审核中';
										}else if(value == 'returned_amount_fail'){
											return '退款失败--具体原因看备注';
										}else if(value == 'returned_return'){
											return '退款审核驳回,在备注中写明驳回原因';
										}else if(value == 'robing'){
											return '抢票中';
										}else if(value == 'order_audit'){
											return '出票审核中';
										}else if(value == 'ticket_success'){
											return '已出票';
										}else if(value == 'user_pay'){
											return '用户付款中';
										}else if(value == 'success'){
											return '已完成';
										}else if(value == 'rob_fail'){
											return '抢单失败';
										}else if(value == 'wait_confirme'){
											return '等待确认';
										}else if(value == 'return'){
											return '退票中';
										}else if(value == 'return_success'){
											return '退票完成';
										}else if(value == 'return_fail'){
											return '退款失败';
										}else if(value == 'rob_check'){
											return '订单审核中';
										}else if(value == 'rob_lock'){
											return '订单已锁定';
										}else if(value == 'wait_pay'){
											return "等待支付";
										}
										
									}
								},
																{
									field : 'modifyDate', 
									title : '订单修改时间' ,
									visible: false
								},
																{
									field : 'orderAmount', 
									title : '订单金额' 
								},
																{
									field : 'robCount', 
									title : '抢单人数' 
								},
																{
									field : 'remark', 
									title : '备注' ,
									visible: false
								},
																{
									field : 'appCode', 
									title : 'app代码' ,
									visible: false
								},
																{
									title : '操作',
									//field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.id
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.id
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.id
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
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