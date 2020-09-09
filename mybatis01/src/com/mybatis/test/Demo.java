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
			 * mapper�ӿ�  dao�ӿ�
			    *   ������ 
			    1.Mapper �ӿ���sqlӳ���ļ��İ�  ӳ���ļ���namespace ��ֵ����ָ���˽ӿڵ�ȫ����
			    2.Mapper�ӿڵķ�������sqlӳ���ļ��ľ���sql���İ�
			    		sql����idֵ������ָ���ӿڵķ�����   
			   
			 */
			/*
			 * Mapper�ӿڿ����ĺô�
			 *  1���и���ȷ������
			 *  2���ӿڱ��� ���ӿڱ�����ǳ��� ����˹淶
			 *     EmployeeDao   EmployeeDaoImpl  EmployeeDaoHibernateImpl  Mybatis����ʵ����
			 */
			
			//��ȡMybatisΪMapper�ӿ����ɵĴ���ʵ�������
			
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
			//��ȡmapper�ӿڴ���ʵ�������
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			//��ѯ
//			Employee employeeById = mapper.getEmployeeById(1001);
//			System.out.println(employeeById);
			
			//���
			Employee employee = 
					new Employee(null, "С����ʦ", "ze@163.com", "Ů");
			mapper.addEmployee(employee);
			System.out.println("���ص�����ֵ��"+employee.getId());
			
			//�޸�
//			Employee employee = 
//					new Employee(1004, "С����ʦ", "ze@163.com", "Ů");
//			mapper.deleteEmployee(1004);
			
			//ɾ��
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
//			Employee employee = mapper.getEmployeeByIdAndLastName(1005, "����ʦ");
//			System.out.println(employee);
			HashMap<String, Object> map = new HashMap<>();
			map.put("id","1005");
			map.put("ln", "����ʦ");
			Employee e = mapper.getEmployeeByMap(map);
			System.out.println(e);
		} finally {
			session.close();
		}
	}
	
	
	
	
}
