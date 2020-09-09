package huanma;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Person ps = (Person)cs.getBean("person");
		
		//÷∏∂®bean¿‡
		Person ps1 = cs.getBean("person1",Person.class);
	
		ps1.luanhao();
	}

}
