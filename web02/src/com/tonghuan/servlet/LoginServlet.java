package com.tonghuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tonghuan.bean.User;
import com.tonghuan.dao.UserDao;
import com.tonghuan.dao.UserDaoImpl;

/**
  *  处理 请求的servlet
  * 	
  * 	 继承 HttpServlet
  * 
  * 
  *
  */

public class LoginServlet  extends HttpServlet{

	/**
	 *  	常用的方法 doGet  doPost service 
	 *		  处理get请求
	 *		  处理post请求
	 *		service : 根据具体的请求方式去调用doGet doPost 方法
	 *
	 */
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("发送成功");
		
		//获取到用户的用户名和密码，进行登陆的业务处理
		/**
		 * HttpServletRequest : 请求对象，
		 *  					Servlet容器会在请求到达后，创建出一个request对象
		 *  					Http请求相关的信息全部封装到该对象中
		 */		
		//获取用户名
		String username = req.getParameter("username");
		//获取密码
		String password = req.getParameter("password");
		System.out.println(username+","+password);
		//验证用户名和密码是否正确
		
		//通过相应对象 HttpServletResponse，给客户端响应数据
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		//获取userdao对象
		UserDao user = new UserDaoImpl();
		
		User user1 = user.getUserByUserPassword(username, password);
		if (user1 != null) {
			//登陆成功
			out.println("<h1><font color = 'greed'>登陆成功<fout><h1>");
		}else {
//			out.println("<h1><font color = 'red'>登陆失败<fout><h1>");
		
			//通过重定向的方式去往登陆界面
			// 服务器会给浏览器发送一个,      302状态码以及一个新的地址
		resp.sendRedirect("login.html");
		
		}
		
		/*if ("admin".equalsIgnoreCase(username) && "123456".equals(password) ) {
			//登陆成功	
			out.println("Login Success  登陆成功");
		}else {
			PrintWriter out = resp.getWriter();
			out.println("Login Fail 登陆失败");
		}*/
	
	
	
	}

}
