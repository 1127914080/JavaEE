package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

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
	
	
	
	//day02
	//查询多行数据返回一个对象的集合
	public List<Employee> getEmps();
	
	//查询单条数据，返回一个map
	public Map<String, Object> getEmployeeByIdReturnMap(Integer id);
	
	//查询多条数据返回一个Map
	@MapKey("id")  //指定使用对象的哪个属性作为Map的key
	public Map<Integer, Employee> getEmpReturnMap();
	
}
