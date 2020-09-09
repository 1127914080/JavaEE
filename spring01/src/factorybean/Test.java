package factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext cs = new ClassPathXmlApplicationContext("spring-factory.xml");
		CarFactoryBean fs = cs.getBean("car",CarFactoryBean.class);
		
		System.out.println(fs);
	}

}
