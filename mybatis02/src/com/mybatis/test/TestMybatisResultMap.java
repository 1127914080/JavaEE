package com.mybatis.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.bean.Department;
import com.mybatis.bean.Employee;
import com.mybatis.dao.DepartmentMapperResultMap;
import com.mybatis.dao.EmployeeMapperResultMap;
import com.mysql.jdbc.exceptions.DeadlockTimeoutRollbackMarker;

public class TestMybatisResultMap {

	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sessionFactory;
	}
		
	@Test
	public void testResultMap() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapperResultMap mapper = session.getMapper(EmployeeMapperResultMap.class);
			Employee emp = mapper.getEmployeeById1(1003);
			System.out.println(emp);
		} finally {
			session.close();
		}
	}
	@Test
	public void testResultMapCascade() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapperResultMap mapper = session.getMapper(EmployeeMapperResultMap.class);
			Employee emp = mapper.getEmpAndDept(1008);
			System.out.println(emp);
			System.out.println(emp.getDept());
		} finally {
			session.close();
		}
	}
	
	
	@Test
	public void testResultDept() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			EmployeeMapperResultMap mapper = session.getMapper(EmployeeMapperResultMap.class);
			Employee emp = mapper.getEmpAndDeptStep(1003);
			System.out.println(emp.getLastName());
			System.out.println("=============");
			System.out.println(emp.getDept());
		} finally {
			session.close();
		}
	}
	@Test
	public void testResultCollection() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			DepartmentMapperResultMap mapper = session.getMapper(DepartmentMapperResultMap.class);
			Department dept = mapper.getDeptAndEmps(4);
			System.out.println(dept);
			System.out.println("=============");
			System.out.println(dept.getEmps());
		} finally {
			session.close();
		}
	}
	@Test
	public void testResultCollection2() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		try {
			DepartmentMapperResultMap mapper = session.getMapper(DepartmentMapperResultMap.class);
			Department dept = mapper.getDeptAndEmpsStep(1);
			System.out.println(dept);
			System.out.println("=============");
			System.out.println(dept.getEmps());
		} finally {
			session.close();
		}
	}


}
