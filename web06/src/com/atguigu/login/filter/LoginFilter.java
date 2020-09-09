package com.atguigu.login.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {
	
	/**
	 * 初始化方法
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LoginFilter  初始化完成了.......");
	}
	
	/**
	 * 真正的过滤处理
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//当前的请求是谁
		HttpServletRequest req = (HttpServletRequest) request; 
		HttpServletResponse resp = (HttpServletResponse) response ;
		
		System.out.println("URI:" + req.getRequestURI());
		System.out.println("URL:" + req.getRequestURL());
		
		String url = req.getRequestURL().toString();
		//判断要过滤的请求
		if(url.endsWith("/main.jsp")) {
			//过滤  引导去往登录页面
			resp.sendRedirect("login.jsp");
		}else {
			//放行 继续执行后续的处理。
			//FilterChain: 过滤器链对象
			chain.doFilter(req, resp);
		}
	}
	/**
	 * 销毁方法
	 * 
	 */
	@Override
	public void destroy() {
		System.out.println("LoginFilter 销毁了......." );
	}
	
	
}
