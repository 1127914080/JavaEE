package com.atguigu.ss.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
        
    }

    //当监听到ServletContext被创建，则执行该方法
	
    public void contextInitialized(ServletContextEvent sce)  { 
         //1，创建SpringIOC容器对象
    		ApplicationContext ctx = 
    				new ClassPathXmlApplicationContext("applicationContext.xml");
    	//2，将SpringIOC容器绑定到ServletContext中
  
    		ServletContext sc = sce.getServletContext();
    		sc.setAttribute("applicationContext", ctx);
    }
	
}
