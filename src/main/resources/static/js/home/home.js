
window.onload=function(){
	
	$.ajax({
        //提交数据的类型 POST GET
        type:"get",
        //提交的网址
        url:"/home/about/open/getType",
        //返回数据的格式
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        
        //成功返回之后调用的函数             
        success:function(data){
        	
        	
        	//alert(data.content);
        	
        $("#me").html(data.content);
       //$("#msg").html(decodeURI(data));
       
          
        }   ,
        //调用执行后调用的函数
        complete: function(XMLHttpRequest, textStatus){
        
        },
        //调用出错执行的函数
        error: function(){
            //请求出错处理
        }         
     });
	
	
	
	$.ajax({
        //提交数据的类型 POST GET
        type:"get",
        //提交的网址
        url:"/home/about/open/getTeam",
        //返回数据的格式
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        
        //成功返回之后调用的函数             
        success:function(data){
        	
        	
        	//alert(data.content);
        	
        //$("#me").html(data.content);
       //$("#msg").html(decodeURI(data));
        	
        	//alert(data.length);
        	
			
		//alert("進來了");
		var teams="";
        	
        	for(var i=0;i<data.length;i++){
        		//alert(data[i].tSyName);
        		var team='<div class="col-md-3 col-sm-6">';
			    team+='<div class="box-style-1 white-bg team-member">';
				team+='<div class="overlay-container">';
				team+='<img src='+data[i].tSySrc+' alt="">';
				team+='<div class="overlay">';
				team+='<ul class="social-links clearfix">';
				team+='<li class="twitter"><a target="_blank" href='+data[i].tSyFacebookUrl+'><i class="fa fa-twitter"></i></a></li>';
				team+='<li class="skype"><a target="_blank" href='+data[i].tSySkypeUrl+'><i class="fa fa-skype"></i></a></li>';
				team+='<li class="facebook"><a target="_blank" href='+data[i].tSyTwitterUrl+'><i class="fa fa-facebook"></i></a></li>';
				team+='</ul> </div> </div> <h3>'+data[i].tSyName+'</h3> '+data[i].tSyContent+'</div> </div>';
				teams+=team;
        		
        	}
        	
        	//alert(teams);
        	//alert(teams);
        	$("#team").html(teams);
          
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


