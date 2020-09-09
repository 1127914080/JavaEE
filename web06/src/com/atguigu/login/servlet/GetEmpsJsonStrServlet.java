package com.atguigu.login.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.login.beans.Employee;
import com.atguigu.login.dao.EmployeeDao;
import com.atguigu.login.dao.EmployeeDaoImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class GetEmpsJsonStrServlet
 */
public class GetEmpsJsonStrServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询所有的员工信息
		EmployeeDao  employeeDao  = new EmployeeDaoImpl();
		List<Employee> emps = employeeDao.selectAllEmps();
		
		//转换成json字符串
		Gson gson = new Gson();
		
		String jsonStr = gson.toJson(emps);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(jsonStr);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
