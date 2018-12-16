
var prefix = "/niu/myRobOrder"
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
						singleSelect : true, // 设置为true将禁止多选
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
								robStatus:$('#idSelect').val()
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
			            showExport: true,                     //是否显示导出
			            exportDataType: "basic",              //basic', 'all', 'selected'.
						columns : [
																{
										field : 'id', 
										title : '抢单' 
										//visible:false
									},
									   							{
									field : 'userId', 
									title : '用户号' ,
									visible:false
								},
																{
									field : 'orderNo', 
									title : '订单号' 
									//visible:false
								},
								{
									field : 'remark', 
									title : '提交人ID' 
								},
																{
									field : 'robStatus', 
									title : '订单状态' ,
									formatter : function(value, row, index) {
									if(value=='wait_rob'){
										return "等待接单";
									}else if(value=='robing'){
										return "抢票中";
									}else if(value=='rob_lock'){
										return"订单已被其他商户提交";
									}else if(value=="user_pay"){
										return"用户付费中";
									}else if(value=="ticket_success"){
										return"已出票";
									}else if(value=="success"){
										return"订单已完成";
									}else if(value=="rob_check"){
										return"已成功提交订单";
									}else{
										return "订单已被抢";
									}
								}
								},
																{
									field : 'ticketIdentity', 
									title : '车票身份证号' 
								},
																{
									field : 'identityType', 
									title : '证件类型' 
								},
																{
									field : 'ticketName', 
									title : '乘车人' 
								},
																{
									field : 'linkmanType', 
									title : '类型' 
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
									title : '出发时间【车次】' ,
									align : 'center',
									formatter : function(value, row, index) {
											var buf='';
											var text=value.split(',');
											for( i=0;i<text.length;i++){
												buf+=text[i]+'<br/>';
											}
											return '<span >'+buf+'</span>';
										}	
								},
														{
									field : 'seatType', 
									title : '坐席' 
								},								{
								
									field : 'robAmount', 
									title : '悬赏金额' ,
									formatter : function(value, row, index) {
										return '<span style="font-size:18px" class="label label-danger">'+value+'元</span>';
									}
								},								
								{
									title : '操作',
									//field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var h='';
										var e='';
										var t='';
										if(row.robStatus=='robing'){
											 h = '<a class="btn btn-danger btn-sm   href="#" mce_href="#" title="删除" onclick="del(\''+row.orderNo+'\',\''+row.id+'\')"><i class="#">删除</i></a>';	
											 e = '<a class="btn btn-primary btn-sm  href="#" mce_href="#" title="提交订单" onclick="robCommit(\''+row.orderNo+'\',\''+row.id+'\')"><i class="#">提交</i></a>';
											 //t='<br\>';
										}else{
											 h = '<a class="btn btn-danger btn-sm  href="#" mce_href="#" title="删除" aria-hidden="true" onclick="del(\''+row.orderNo+'\',\''+row.id+'\')"><i class="#">删除</i></a>';	
											 e = '<a class="btn btn-primary btn-sm    href="#" mce_href="#" title="提交订单审核中" disabled="disabled" ><i class="#">提交</i></a>';
											// t='<br\>';
										}
										//var t ='<br\>'
										return h+e;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');

}	



/**
 * 根据订单号和用户id删除订单号
 * @param orderNo
 * @param userId
 */

function del(orderNo,id){
	layer.confirm('确定删除订单号为:'+orderNo+'？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/del",
			type : "post", 
			data : {
				'orderNo' : orderNo,
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

function robCommit(orderNo,id){
    layer.open({                 //layui的函数 需要引入layui的js和css
        type : 2,                //类型为2  是弹窗
        title : '提交抢票信息详情',       //弹窗标题
        maxmin : true,
        shadeClose : true, // 点击遮罩关闭层
        area : [ '1000px', '520px' ],         //弹窗的大小面积，可以调
        content : prefix+'/myEdit/'+orderNo    
    });
	
}

disabledSelect

$("select#disabledSelect").change(function(){
	     //console.log($(this).val());
	//alert($(this).val());
	$("#idSelect").val($(this).val());
	reLoad();
	 });