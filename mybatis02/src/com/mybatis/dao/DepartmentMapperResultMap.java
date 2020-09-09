package com.mybatis.dao;

import com.mybatis.bean.Department;

public interface DepartmentMapperResultMap {

	public Department getDeptById(Integer id);
	
	public Department getDeptAndEmps(Integer id);
	
	public Department getDeptAndEmpsStep(Integer id);
}
