package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.bean.Employee;

public interface EmployeeMapperDynamicSQL {

	public List<Employee> getEmpsByConditionIfWhere(Employee Condition);
	
	public List<Employee>  getEmpsByConditionTrim(Employee Condition);
	
	public void  updateEmpByConditionSet(Employee Condition);
	
	public List<Employee>  getEmpsByConditionChoose(Employee Condition);
	
	public List<Employee>  getEmpsByIds(@Param("ids")List<Integer> ids );
	
	//��������:  �޸�  ɾ��  ���
	public void  addEmps(@Param("emps")List<Employee> emps );
	
}
