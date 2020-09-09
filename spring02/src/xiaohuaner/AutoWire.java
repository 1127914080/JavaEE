package xiaohuaner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWire {

	@Test
	public void test() {
		ApplicationContext cls = 
				new ClassPathXmlApplicationContext("spring-autowire.xml");
		Person ps = cls.getBean("person",Person.class);
		System.out.println(ps);
	}

}
