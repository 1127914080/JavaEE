package com.atguigu.springmvc.dao;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atguigu.springmvc.beans.Department;
import com.atguigu.springmvc.beans.Employee;



@Repository
public class EmployeeDao {

	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static{
		employees = new HashMap<Integer, Employee>();

		employees.put(1001, new Employee(1001, "小苍老师", "cang@163.com", 0, new Department(101, "人事部")));
		employees.put(1002, new Employee(1002, "波多野结衣老师", "bo@163.com", 0, new Department(102, "财政部")));
		employees.put(1003, new Employee(1003, "吉泽老师", "ji@163.com", 0, new Department(103, "搞事部")));
		employees.put(1004, new Employee(1004, "天海翼老师", "tian@163.com", 0, new Department(104, "外交部")));
		employees.put(1005, new Employee(1005, "玛丽亚老师", "maliya@163.com", 0, new Department(105, "外交部")));
	}
	
	private static Integer initId = 1006;
	
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	
	public Collection<Employee> getAll(){
		return employees.values();
	}
	
	public Employee get(Integer id){
		return employees.get(id);
	}
	
	public void delete(Integer id){
		employees.remove(id);
	}
}
