package com.tonghuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tonghuan.bean.User;
import com.tonghuan.dao.UserDao;
import com.tonghuan.dao.UserDaoImpl;

public class RegistServlet  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//注册的业务处理 :
		//1,获取到用户提交的注册信息
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//2,判断用户是否存在
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUser(username);
		
		if (user!=null) {
			//注册失败
			//转发
			req.setAttribute("regist_msg", "用户名已存在");
			req.getRequestDispatcher("regist.jsp").forward(req, resp);
		}
		
		//3,将用户注册信息插入到数据库
		userDao.insertUser(username, password);
		
		//4,注册成功去往登陆界面，注册失败，回到注册界面，并进行相应的提示
		
		resp.sendRedirect("login.jsp");
	}
	
	
	
}
