package com.atguigu.ss.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.atguigu.ss.beans.Person;

public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//访问到SpringIOC容器中的person对象. 
		//从ServletContext对象中获取SpringIOC容器对象
		ServletContext sc = getServletContext();
		
		ApplicationContext ctx =  (ApplicationContext)sc.getAttribute("applicationContext");
	
		Person person = ctx.getBean("person",Person.class);
		
		person.sayHello();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
