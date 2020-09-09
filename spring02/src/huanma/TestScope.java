package huanma;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	@Test
	public void test() {
		ApplicationContext cls = 
				new ClassPathXmlApplicationContext("spring-scope.xml");
		
	
		
	}

}
