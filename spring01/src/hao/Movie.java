package hao;

public class Movie {
	
	private String name;
	private String action;
	private Double price;
	public Movie(String name, String action, Double price) {
		super();
		this.name = name;
		this.action = action;
		this.price = price;
	}
	
	
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}





	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}





	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}





	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
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
		return "Movie [name=" + name + ", action=" + action + ", price=" + price + "]";
	}
	
	
	

}
