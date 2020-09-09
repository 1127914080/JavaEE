<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
    span{
			color: red;
		}
	</style>
	<script type="text/javascript">
		//js代码
		function clearLoginMsg() {
			var spanEle = document.getElementById("login_msg");
			spanEle.innerHTML="";
		}
		
		
		
		
	</script>
	<!-- <script type="text/javascript" src="引入一个js文件"></script> -->
		
</head>

<body bgcolor="pink">
		<h1>欢迎登陆</h1>
		<!--action : 请求的地址
			method : 请求的方式
			get  : 将请求数据拼接到地址中，直接暴露出来
			post : 将请求数据存到请求提交，不会直接暴露出来
		  -->
		<form action="login" method="post">
			用户名称 :<input type="text" name="username" onfocus="clearLoginMsg();"/>
			<%-- 
			
			<%
				//获取request对象
			String loginMsg=(String)request.getAttribute("login_msg");
			
			%>
			<span><%=loginMsg==null?"":loginMsg%>></span>
					--%>
			<!-- EL表达式 默认 会从PageScope requestScope sessionScope applicationScope-->		
			<span id="login_msg">${requestScope.login_msg}</span>					 
			<br/>
			用户密码 :<input type="password" name="password"/>
			<br/>
			<input type="submit" value="Login"/>
		
		</form>
	

</body>
</html>