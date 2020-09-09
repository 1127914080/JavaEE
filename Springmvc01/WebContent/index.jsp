<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="testServletAPI">Test ServletAPI</a>
	<br/>
	<form action="testPOJO" method="post">
		用户名称：<input type="text" name="username"/><br/>
		用户密码：<input type="password" name="password"/><br/>
		用户邮箱：<input type="text" name="email"/><br/>
		用户性别：男<input type="radio" name="gender" value="男"/>
			         女<input type="radio" name="gender" value="女"/><br/>
			         
		用户省份：<input type="text" name="address.province"/><br/>
		用户城市：<input type="text" name="address.city"/><br/>
		<input type="submit" name="注册"/>
	</form>
	<br/>
	<a href="testCookieValue">Test CookieValue</a>
	<br/>
	<a href="testRequestHeader">Test RequestHeader</a>
	<br/>
	<a href="testRequestParam?username=Tom&age=22">Test RequestParam</a>
	<br/>
	<!-- 修改一个订单 -->
	<form action="order" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="REST PUT"/>
	</form>
	<br/>
	
	<!-- 添加一个新的订单 -->
	<form action="order" method="post">
		<input type="submit" value="REST POST"/>		
	</form>
	<br/>
	<!-- 删除id为1001的订单 -->
	<form action="order/1001" method="post">
		<!-- 隐藏域· -->
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="REST DELETE"/>
	</form>
	<br/>
	<!-- 查询id为1001的订单 -->
	<a href="order/1001">REST GET</a>
	<br/>
	<br/>
	<a href="testPathVariable/Admin/1001">TestPathVariable</a>
	<br/>
	<a href="testRequestMappingParamsAndHeaders?username=huan&age=20">test  RequestMapping   Params  Headers</a>
	<br/>
	<form action="testRequestMappingMethod" method="post">
		<input type="submit" value="欢姐点击点击">
	</form>
	<br/>
	<a href="testRequestMappingMethod">testRequestMapping Method</a>
	<br/>
	<a href="testRequestMapping">Test RequestMapping</a>
	<br/>
	<a href="hello">Hello SpringMVC</a>
</body>
</html>