package com.mybatis.dao;

import java.util.Map;

import com.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	//定于CRUD相关的方法
	
	//根据id查询Employee
	public Employee getEmployeeById(Integer id);
	
	//添加employee
	public void addEmployee(Employee employee);
	
	//修改employee
	public void upadteEmployee(Employee employee);
	
	
	//删除employee
	public void deleteEmployee(Integer id);
	
	
	public Employee getEmployeeByIdAndLastName(Integer id,String lastName);
	
	
	public Employee getEmployeeByMap(Map<String, Object> map);
	
	
	
	
	
	
	
	
	
	
}
