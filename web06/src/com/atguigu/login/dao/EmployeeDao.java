package com.atguigu.login.dao;

import java.util.List;

import com.atguigu.login.beans.Employee;

public interface EmployeeDao {
	
	public List<Employee> selectAllEmps();
}
