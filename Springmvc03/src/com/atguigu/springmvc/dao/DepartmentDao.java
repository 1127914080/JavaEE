package com.atguigu.springmvc.dao;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.atguigu.springmvc.beans.Department;



@Repository
public class DepartmentDao {

	private static Map<Integer, Department> departments = null;
	
	static{
		departments = new HashMap<Integer, Department>();
		
		departments.put(101, new Department(101, "人事部"));
		departments.put(102, new Department(102, "财政部"));
		departments.put(103, new Department(103, "搞事部"));
		departments.put(104, new Department(104, "外交部"));
		departments.put(105, new Department(105, "外交部"));
	}
	
	public Collection<Department> getDepartments(){
		return departments.values();
	}
	
	public Department getDepartment(Integer id){
		return departments.get(id);
	}
	
}
