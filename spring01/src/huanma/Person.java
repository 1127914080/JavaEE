package huanma;

public class Person {
	
	private String name; //成员变量
	
	

	public Person() {
		
	
	}
	
	public String getName() {
		return name;
	}

	//成员属性
	public void setName1(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public void luanhao() {
		System.out.println("我是佟欢的甜心"+ name);
	}

}
