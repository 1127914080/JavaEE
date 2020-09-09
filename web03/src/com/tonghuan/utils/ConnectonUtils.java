package com.tonghuan.utils;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

/**
 *  	连接的工具类
 * 
 *
 */
public class ConnectonUtils {

	private static String driver = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	private static Properties prop = new Properties();
	
	//ThreadLocal : 保证一个线程中只能有一个连接
	private static ThreadLocal<Connection> tl= new ThreadLocal<>();
	
	//静态代码块读取db.properties
	
	static {
		try {
		//类加载读取文件
		InputStream in = 
				ConnectonUtils.class.getClassLoader().getResourceAsStream("db.properties");
	
			prop.load(in);
			driver=prop.getProperty("jdbc.driver");
			url=prop.getProperty("jdbc.url");
			username=prop.getProperty("jdbc.username");
			password=prop.getProperty("jdbc.password");
			
			Class.forName(driver);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获取连接的方法
	public static  Connection  getConn()  throws Exception{
		//先尝试从tl中获取
		Connection conn = tl.get();
		if(conn == null ) {
			conn = (Connection) DriverManager.getConnection(url, username, password);
			tl.set(conn);
		}
		return conn ;
	}
	/*
	 * 
	 * 	关闭连接的方法
	 */
	
	public static void closeConn() throws Exception{
		
		Connection conn = tl.get();
		if (conn!=null) {
			conn.close();
		}
		//相当于tl里的连接为空 ，哪怕连接对象不可用了， 但是对象还在 
		//是设置为空的时候，还能给你一个新的连接
		
		tl.set(null);
	}
	
	public static void main(String[] args) throws Exception {
		Connection conn1 = getConn();
		
		closeConn();
		Connection conn2 = getConn();
		
		System.out.println(conn1==conn2);
	}
	
	
}
