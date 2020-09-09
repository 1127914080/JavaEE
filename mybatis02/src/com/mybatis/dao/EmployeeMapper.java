package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

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
	
	
	
	//day02
	//��ѯ�������ݷ���һ������ļ���
	public List<Employee> getEmps();
	
	//��ѯ�������ݣ�����һ��map
	public Map<String, Object> getEmployeeByIdReturnMap(Integer id);
	
	//��ѯ�������ݷ���һ��Map
	@MapKey("id")  //ָ��ʹ�ö�����ĸ�������ΪMap��key
	public Map<Integer, Employee> getEmpReturnMap();
	
}
