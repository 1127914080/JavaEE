package com.mybatis.test;

import static org.junit.Assert.*;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.bean.Employee;
import com.mybatis.dao.EmployeeMapper;

public class Demo {

	@Test
	public void test() throws IOException {
		String resource = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println(sqlSessionFactory);
		SqlSession session = sqlSessionFactory.openSession();
		System.out.println(session);
		try {
			 Employee employee = session.selectOne("suibian.selectEmployee", 1001);
			 System.out.println(employee);
		} finally {
			 session.close();
			}
	
	}
	
	@Test
	public void HelloWorld() throws IOException {
		String resource = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sessionFactory.openSession();
		try {
			/**
			 * mapper接口  dao接口
			    *   两个绑定 
			    1.Mapper 接口与sql映射文件的绑定  映射文件的namespace 的值必须指定乘接口的全类名
			    2.Mapper接口的方法，与sql映射文件的具体sql语句的绑定
			    		sql语句的id值，必须指定接口的方法名   
			   
			 */
			/*
			 * Mapper接口开发的好处
			 *  1，有更明确的类型
			 *  2，接口本身 ：接口本身就是抽象， 抽出了规范
			 *     EmployeeDao   EmployeeDaoImpl  EmployeeDaoHibernateImpl  Mybatis代理实现类
			 */
			
			//获取Mybatis为Mapper接口生成的代理实现类对象
			
			EmployeeMapper dao = session.getMapper(EmployeeMapper.class);
			Employee employee = dao.getEmployeeById(1003);
			System.out.println(employee);
			
		} finally {
			session.close();
		}
		
	}
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sessionFactory;
	}
	@Test
	public void testCRUD() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		try {
			//获取mapper接口代理实现类对象
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			//查询
//			Employee employeeById = mapper.getEmployeeById(1001);
//			System.out.println(employeeById);
			
			//添加
			Employee employee = 
					new Employee(null, "小泽老师", "ze@163.com", "女");
			mapper.addEmployee(employee);
			System.out.println("返回的主键值："+employee.getId());
			
			//修改
//			Employee employee = 
//					new Employee(1004, "小泽老师", "ze@163.com", "女");
//			mapper.deleteEmployee(1004);
			
			//删除
//			mapper.deleteEmployee(1005);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testParameter() throws IOException {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//			Employee employee = mapper.getEmployeeByIdAndLastName(1005, "苍老师");
//			System.out.println(employee);
			HashMap<String, Object> map = new HashMap<>();
			map.put("id","1005");
			map.put("ln", "苍老师");
			Employee e = mapper.getEmployeeByMap(map);
			System.out.println(e);
		} finally {
			session.close();
		}
	}
	
	
	
	
}
