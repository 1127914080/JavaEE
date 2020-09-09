package huanmei;

public class Car {

	private String brand;
	private Double price;
	
	
	public Car() {
		System.out.println("====>1，调用构造器创建bean对象");
	}
	
	
	/**
	 * 初始化方法
	 *  需要通过init-method来指定初始化方法
	 */
	public void init() {
		System.out.println("====>3,调用初始化方法");
	}
	/**
	 * 销毁方法 ： IOC容器关闭 ，bean对象销毁
	 */
	public void destroy() {
		System.out.println("====>5,调用销毁方法");
	}
	
	
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		System.out.println("====>2，调用构造器创建bean对象");
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
