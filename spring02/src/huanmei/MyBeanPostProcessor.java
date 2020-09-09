package huanmei;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor  implements BeanPostProcessor{

	
	/**
	 * ��bean���������ڵĳ�ʼ������֮ǰִ��
	 * Object bean ��֤�ڱ���������
	 * String beanName : bean�����idֵ
	 */
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization");
		return bean;
	}

	/**
	 *  ��bean���������ڵĳ�ʼ������֮ǰִ��
	 * 
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

}
