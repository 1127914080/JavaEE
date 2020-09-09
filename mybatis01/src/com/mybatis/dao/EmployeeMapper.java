package com.mybatis.dao;

import java.util.Map;

import com.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	//����CRUD��صķ���
	
	//����id��ѯEmployee
	public Employee getEmployeeById(Integer id);
	
	//���employee
	public void addEmployee(Employee employee);
	
	//�޸�employee
	public void upadteEmployee(Employee employee);
	
	
	//ɾ��employee
	public void deleteEmployee(Integer id);
	
	
	public Employee getEmployeeByIdAndLastName(Integer id,String lastName);
	
	
	public Employee getEmployeeByMap(Map<String, Object> map);
	
	
	
	
	
	
	
	
	
	
}
