<%@page import="com.atguigu.login.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> 欢迎   
			<font color="blue">${sessionScope.loginUser.username }</font>
			   登录,
			   当前在线<font color="blue">${applicationScope.count}</font> 人
			 </h1>
	<br/>
	<h2 align="center">员工信息列表</h2>
	
	<c:if test="${!empty emps}">
		<table border="1px" width="70%" align="center" cellspacing="0px">
			<tr>
				<th>ID</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Gender</th>
				<th>DeptName</th>
				<th>Operation</th>
			</tr>
			<!-- 通过循环 显示 员工数据 -->
			<!-- 
				c:forEach  循环 迭代
					items: 指定要迭代的集合
					var: 代表当前迭代出的元素
			 -->
			<c:forEach items="${emps}" var="emp">
				<tr align="center">
					<td>${emp.id }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email }</td>
					<td>${emp.gender==0?"女":"男" }</td>
					<td>${emp.dept.deptName }</td>
					<td>
						<a href="#">Edit</a>
						&nbsp;&nbsp;
						<a href="#">Delete</a>
					</td>
				</tr>
			</c:forEach>
			
			
			
			<%-- 
					<%
						//获取所有的员工数据
						List<Employee> emps =(List<Employee> )request.getAttribute("emps");
					
						for(Employee employee :emps ){
							%>
						<tr align="center">
							<td><%=employee.getId() %></td>
							<td><%=employee.getLastName() %></td>
							<td><%=employee.getEmail() %></td>
							<td><%=employee.getGender()==0?"女":"男" %></td>
							<td><%=employee.getDept().getDeptName() %></td>
							<td>
								<a href="#">Edit</a>
								<a href="#">Delete</a>
							</td>
						</tr>
						<%	
						}
					%>
			--%>
		</table>
	</c:if>
	<c:if test="${empty  emps}">
		<h2 align="center">没有任何员工信息。</h2>
	</c:if>
	<h3 align="center"><a href="#">Add New Emp</a></h3>
	
	
	<!-- 
		JSTL:
			c:if   
			c:foreach 等
		
		使用标签:
			1. 导入标签库 jar包
			2. 在jsp页面中引入标签库。
	 -->
</body>
</html>











