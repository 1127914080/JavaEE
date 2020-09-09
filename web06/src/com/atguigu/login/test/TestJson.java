package com.atguigu.login.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.atguigu.login.beans.Department;
import com.atguigu.login.beans.Employee;
import com.atguigu.login.dao.EmployeeDao;
import com.atguigu.login.dao.EmployeeDaoImpl;
import com.google.gson.Gson;

public class TestJson {

	@Test
	public void testJsonToJava() {
		Gson gson = new Gson();
		//json字符串转换为java对象
		String jsonStr = "{\"id\":1001,\"lastName\":\"Tom\",\"email\":\"tom@sina.com\",\"gender\":1}";
		
		Map<String,Object> map = gson.fromJson(jsonStr, Map.class);
		System.out.println(map);
		
		Employee employee = gson.fromJson(jsonStr, Employee.class);
		System.out.println("employee:" + employee);
	}
	
	@Test
	public void testJavaToJson() {
		Employee employee = new Employee();
		employee.setId(1001);
		employee.setLastName("Jerry");
		employee.setEmail("jerry@sina.com");
		employee.setGender("男");
		
		Department dept = new Department();
		dept.setId(1);
		dept.setDeptName("开发部");
		
		employee.setDept(dept);
		
		
		Gson gson = new Gson();
		
		String jsonStr = gson.toJson(employee);
		System.out.println(jsonStr);
		
		System.out.println("==============================");
		EmployeeDao  employeeDao = new EmployeeDaoImpl();
		
		List<Employee> emps =employeeDao.selectAllEmps();
		
		jsonStr = gson.toJson(emps);
		System.out.println(jsonStr);
	
	}

}
