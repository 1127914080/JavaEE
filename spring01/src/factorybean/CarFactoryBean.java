package factorybean;

import org.springframework.beans.factory.FactoryBean;

import factorybean.Car;

public class CarFactoryBean implements FactoryBean<Car>{

	@Override
	//����bean���崴��bean��������getObject���������ص�
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("������", "����", (double) 50000);
	}

	@Override
	//���ؾ����bean��������
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	//bean�ǵ�����Ҳ������ԭ�ͣ��ǵ����� 
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
