package factorybean;

import org.springframework.beans.factory.FactoryBean;

import factorybean.Car;

public class CarFactoryBean implements FactoryBean<Car>{

	@Override
	//工厂bean具体创建bean对象是由getObject方法来返回的
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("五菱宏光", "五菱", (double) 50000);
	}

	@Override
	//返回具体的bean对象类型
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	//bean是单例，也可以是原型（非单例） 
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
