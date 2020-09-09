package com.tonghuan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tonghuan.bean.User;
import com.tonghuan.utils.ConnectonUtils;

public class UserDaoImpl implements UserDao {
	Connection conn = null;
	PreparedStatement ps = null;
	User u = null;

	@Override
	public User getUserByUserPassword(String username, String password) {
		// JDBC : 获取连接 编写SQL 预编译SQL 设置参数 执行SQL 封装结果，关闭链接
		// 获取连接
		try {
		/*  Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/atguigu";
			String user = "root";
			String pawd = "123";
			conn = DriverManager.getConnection(url, user, pawd);
			
		 */
			
			conn=ConnectonUtils.getConn();	
			String sql = "select id,username,password from tbl_user where username=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
			}
			
			
			return u;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ConnectonUtils.closeConn();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}

}
