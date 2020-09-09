<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


	<style type="text/css">
	
		#d1{
			width : 200px;
			height: 200px;
			backgroup-color : red;
		}
		
	</style>



	<script type="text/javascript">
		//定义函数   function-> Java里的方法
		function clickButton() {
//			alert("是谁在点我");
		var spanEle=window.document.getElementById("s1");
		//innerHTML 标签与标签之间的内容
		var spanmsg=spanEle.innerHTML;
		alter(spanmsg);
		}
		
		$(function() { //相当于window.onload();
		//$("#d2")  相当于document.getElementById("d2")	
		//当  $("#d2") 点击  click  获取function
		 	$("#d2").click(function() {  //动态绑定事件
				$("#s1").html();
				//alter(msg);
				
				$("#i1").val(msg)
				
				//Jquery --> Dom
				var Job = $("#s1");
				var dObj = Job[0] ;   //Jobj.get(0)
			
			//Dom - - > JQuery
			var JJob = $(dObj);
		 	
		 	});
		});
		
		
	
	</script>
	
	<script type="text/javascript" src="scripts/jquery-1.7.2.min.js">
	
	
	</script>




</head>
<body>
<!-- java代码
	 Java片段
	 表达式
	 -->
	 <!-- java 片段  
	 
	 
	  -->
	  
	  <%
	  	String str = "abc";
	  	System.out.println("abc");
	  %>
	  
	  <!-- 表达式 -->
	  <%=  5>3?"大于 ":"小于" %>
	  
	  <!-- jsp 界面的执行原理  ：
	     jsp本质上是一个Servlet 执行的时候会先在转化成一个Java文件 ，再编译成class 文件
	     	如何转化 ：
	     		Java代码片段照搬
	     			html ,css js 表达式，通过输出流
	     			 	out.write() 方法 往出写
	
	  		作用：
	  		 1. 可以自动的将html相关的代码通过流谢大服务器端
	  		 2.支持写Java代码，可以灵活的做出一些处理
	  	
	  
	   -->
	  		  <!-- EL表达式的常用 -->
		  <br/>
		  
		  ${1+1}
		  <br/>
		  ${2>3 }
		  <br/>
		  ${empty a }
		  
		  <br/>
		  
		  <input type="button" value="点我呀" onclick="clickButton();"/>
		  
		  <div id="d1" onmouseover="mouseOver();" onmouseout="mouseOut();"></div>
		  
		  <span id="s1">复杂的事情简单做，简单的事情重复做</span>
		  <br/>
		  <input id="i1" type="text"  name="msg" />
		  
		  <input type="button" id="d2" value="测试Jquery" />
		  
		  <br/>

</body>
</html>