package kaoshi;

public class Girl {

	private String name;
	private double hight;
	private double weight;

	public Girl() {
		super();

	}

	public Girl(String name, double hight, double weight) {
		super();
		this.name = name;
		this.hight = hight;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", hight=" + hight + ", weight=" + weight + "]";
	}
	
	public void speak(String s){
		System.out.println(s);
	}

	public void show() {
		System.out.println("我叫:" + name + "\t身高:" + hight + "\t体重:" + weight);
	}

}
