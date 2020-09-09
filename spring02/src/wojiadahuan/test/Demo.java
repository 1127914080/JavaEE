package wojiadahuan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wojiadahuan.controller.UserController;
import wojiadahuan.dao.UserDaoImpl;
import wojiadahuan.service.UserServerImpl;

public class Demo {
	
	@Test
	public void demo() {
		ApplicationContext cls =
				new ClassPathXmlApplicationContext("spring-huanma.xml");
	
		UserController uc = cls.getBean("userController",UserController.class);
//		System.out.println("uc:"+uc);
//		
//		
//		UserServerImpl us = cls.getBean("userServerImpl",UserServerImpl.class);
//		System.out.println("us:"+us);
//	
//		UserDaoImpl ud = cls.getBean("userDaoImpl",UserDaoImpl.class);
//		System.out.println("ud:"+ud );
	
		uc.regist();
		
	}

}
