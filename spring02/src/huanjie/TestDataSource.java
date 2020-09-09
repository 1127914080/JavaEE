package huanjie;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	
	@Test
	public void Source() throws SQLException{
		ApplicationContext cls = 
				new ClassPathXmlApplicationContext("spring-datasource.xml");
			DataSource bean = cls.getBean("dataSource",DataSource.class);
		
			System.out.println("ds"+bean);
			
			System.out.println(bean.getConnection());
			
			
			
			
	
	}

}
