package huanmei;

public class Car {

	private String brand;
	private Double price;
	
	
	public Car() {
		System.out.println("====>1�����ù���������bean����");
	}
	
	
	/**
	 * ��ʼ������
	 *  ��Ҫͨ��init-method��ָ����ʼ������
	 */
	public void init() {
		System.out.println("====>3,���ó�ʼ������");
	}
	/**
	 * ���ٷ��� �� IOC�����ر� ��bean��������
	 */
	public void destroy() {
		System.out.println("====>5,�������ٷ���");
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
		System.out.println("====>2�����ù���������bean����");
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
