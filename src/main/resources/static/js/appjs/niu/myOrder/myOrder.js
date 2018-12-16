
var prefix = "/niu/myOrder"
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
						sortOrder: "desc",//初始化加载第一页，默认第一页
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
								offset:params.offset
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
									title : '订单id'
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
									field : 'orderStatus', 
									title : '订单状态' ,
									formatter : function(value, row, index) {
										if(value=='wait_rob'){
											return '等待抢单';
										}else if(value=='robing'){
											return "抢票中";
										}else{
											return "订单已被抢";
										}
									}
								},
																{
									field : 'ticketIdentity', 
									title : '车票身份证号' ,
									visible:false
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
									title : '坐席【车次】' ,
									formatter : function(value, row, index) {
										var buf='';
										var text=value.split(',');
										for( i=0;i<text.length;i++){
											buf+=text[i]+'<br/>';
										}
										return '<span >'+buf+'</span>';
									}	

								},								{
								
									field : 'orderAmount', 
									title : '悬赏金额' ,
									formatter : function(value, row, index) {
										return '<span style="font-size:18px" class="label label-danger">'+value*0.8+'元</span>';
									}
								},								
								{
									title : '操作',
									//field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var h='';
										if(row.orderStatus=='rob_check' || row.orderStatus=='success_check'){
										 h = '<a class="btn btn-primary btn-sm  href="#" mce_href="#" title="接单" disabled="disabled"  onclick="jd(\''+row.orderNo+'\',\''+row.userId+'\',\''+row.orderStatus+'\',\''+row.orderAmount+'\',\''+row.id+'\')"><i class="#">接单</i></a> ';											
										}else{
										 h = '<a class="btn btn-primary btn-sm  href="#" mce_href="#" title="接单" onclick="jd(\''+row.orderNo+'\',\''+row.userId+'\',\''+row.orderStatus+'\',\''+row.orderAmount+'\',\''+row.id+'\')"><i class="#">接单</i></a> ';	
										}
										return h;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');

}

function jd(orderNo,userId,orderStatus,orderAmount,id){
	layer.confirm('确定需要接订单号为:'+orderNo+',金额为：'+orderAmount*0.8+'元？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/jd",
			type : "post", 
			data : {
				'orderNo' : orderNo,
				'userId' : userId,
				'orderStatus':orderStatus,
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