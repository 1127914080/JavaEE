package com.atguigu.login.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听Session生命周期相关的事件
 *
 */
public class MySessiListeneron implements HttpSessionListener {
	
	/**
	 * 当监听到session对象被创建，则会执行该方法
	 */
    public void sessionCreated(HttpSessionEvent se)  { 
    	//ServletContext :Servlet上下文对象. 
    	//  WEB应用服务器会为每个web应用创建唯一一个ServletContext对象. 
    	//  在整个web应用中作用域最大且是所有的用户可共享的. 
    	//  ServletContext在web引用服务器启动则被创建， 服务器销毁此对象才会被销毁. 
    	
    	
    	//获取到ServletContext 
    	ServletContext sc = se.getSession().getServletContext();
    	//我们会在ServletContext中绑定一个在线人数， 通过  count 这个key
    	//尝试从Servletcontext中获取 count
    	
    	Object count = sc.getAttribute("count");
    	if(count == null) {
    		// 第一个用户上线
    		sc.setAttribute("count", 1);
    	}else {
    		sc.setAttribute("count", (Integer)count+1 );
    	}
    	
    }
    /**
     * 当监听到session对象被销毁，则会执行该方法
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    }
	
}
