package huanma;

public class Person {
	
	private String name; //��Ա����
	
	

	public Person() {
		
	
	}
	
	public String getName() {
		return name;
	}

	//��Ա����
	public void setName1(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public void luanhao() {
		System.out.println("����١��������"+ name);
	}

}
