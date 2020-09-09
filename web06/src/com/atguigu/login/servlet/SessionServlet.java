package com.atguigu.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		System.out.println("当前请求的request对象:" + request);
		
		//获取session对象
		
		HttpSession session = request.getSession();
		
		System.out.println("当前请求的session对象:" + session);
		System.out.println("sessionID:" + session.getId());
	
		System.out.println("====================================");
		
		response.getWriter().println("success");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
