package hao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext sc = new ClassPathXmlApplicationContext("spring-di1.xml");
		
		Movie fs = sc.getBean("movie",Movie.class);
		System.out.println(fs);
	}

}
