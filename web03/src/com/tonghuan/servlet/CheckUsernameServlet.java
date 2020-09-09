package com.tonghuan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tonghuan.bean.User;
import com.tonghuan.dao.UserDao;
import com.tonghuan.dao.UserDaoImpl;

/**
 * Servlet implementation class CheckUsernameServlet
 */
@WebServlet("/CheckUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String username = request.getParameter("username");
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUser(username);
		
		String msg="";
		if(user==null) {
			//可用
			msg="0";
		}else {
			//不可用
			msg = "1";
		}
		response.setContentType("text.html;charst=utf-8");
		response.getWriter().println(msg);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
