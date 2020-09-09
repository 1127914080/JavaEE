package huanmei;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifrCycle {
	
	@Test
	public void testLifrCycle(){
		ConfigurableApplicationContext cls = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
		Car car = cls.getBean("car",Car.class);
		System.out.println("====>4,使用bean对象"+car);
	
		//关闭资源
		cls.close();
	}

}
