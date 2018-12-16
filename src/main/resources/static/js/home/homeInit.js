 
    
     //提交建议或者意见信息
     function commIt(){
    	 var name=$("#name1").val();
    	 var email=$("#email1").val();
    	 var text=$("#message1").val();
    	// alert(name.trim().length);
    	if(name.trim().length==0){
    		alert("请输入姓名！");
    		return;
    	}
    	if(email.trim().length==0){
    		alert("请输入邮箱！");
    		return;
    	}
    	if(text.trim().length==0){
    		alert("请输入信息！");
    		return;
    	}
    	
 		$.ajax({
	        //提交数据的类型 POST GET
	        type:"get",
	        //提交的网址
	        url:"/niu/homeAdvice/saveAdvice",
	        data:{
	        	"name":name,
	        	"email":email,
	        	"text":text
	        		
	        },
	        //返回数据的格式
	        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
	        //成功返回之后调用的函数     
	      
	        success:function(data){
	        	alert(data.msg);
	        	//parent.layer.msg(data.msg);
	        	//alert(data.content);
	        }   ,
	        //调用执行后调用的函数
	        complete: function(XMLHttpRequest, textStatus){
	        
	        },
	        //调用出错执行的函数
	        error: function(){
	            //请求出错处理
	        }         
	     });

     }



