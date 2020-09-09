<%@page import="com.atguigu.login.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> 欢迎   <font color="blue">${sessionScope.loginUser.username }</font>   登录</h1>
	<h2 align="center">员工信息列表</h2>
	<table border="1px" width="70%" align="center" cellspacing="0px">
		<tr>
			<th>ID</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DeptName</th>
			<th>Operation</th>
			
		</tr>
		<!--通过循环显示员工数据 -->
		<%
			//获取所有员工数据
		List<Employee> emps=(List<Employee>)request.getAttribute("emps");
			for(Employee employee: emps){
				%>
				<tr align="center">
					<td><%=employee.getId() %>></td>
					<td><%=employee.getLastName() %>></td>
					<td><%=employee.getEmail() %>></td>
					<td><%=employee.getGender() %>></td>
					<td><%=employee.getDept().getDeptName() %>></td>
					<td>
						<a href="#">Edit</a>
						<a href="#">Delete</a>
					</td>
				
				<tr/>
			
			<% 
			}
			
			%>

	</table>
</body>
</html>