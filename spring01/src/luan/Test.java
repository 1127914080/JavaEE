package luan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cs = new ClassPathXmlApplicationContext("spring-di.xml");
		Car ps = cs.getBean("car",Car.class);
	
		System.out.println(ps);
	
	}

}
