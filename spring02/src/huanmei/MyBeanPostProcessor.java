package huanmei;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor  implements BeanPostProcessor{

	
	/**
	 * 在bean的生命周期的初始化方法之前执行
	 * Object bean ：证在被创建对象
	 * String beanName : bean对象的id值
	 */
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization");
		return bean;
	}

	/**
	 *  在bean的生命周期的初始化方法之前执行
	 * 
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

}
