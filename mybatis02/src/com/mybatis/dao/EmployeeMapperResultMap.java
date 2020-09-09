package com.mybatis.dao;

import java.util.List;

import com.mybatis.bean.Employee;

public interface EmployeeMapperResultMap {

	public Employee getEmployeeById1(Integer id);
	
	public Employee getEmpAndDept(Integer id);
	
	public Employee getEmpAndDeptStep(Integer id);

	public List<Employee> getEmpsByDid(Integer did);
}
