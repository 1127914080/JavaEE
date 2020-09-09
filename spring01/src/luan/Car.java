package luan;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private String pinpai;
	private String canjia;
	private Double jiage ;
	
	@Autowired
	public Car() {}
	

	public Car(String pinpai, String canjia, Double jiage) {
		
		this.pinpai = pinpai;
		this.canjia = canjia;
		this.jiage = jiage;
	}

	/**
	 * @return the pinpai
	 */
	public String getPinpai() {
		return pinpai;
	}
	
	/**
	 * @param pinpai the pinpai to set
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * @return the canjia
	 */
	public String getCanjia() {
		return canjia;
	}
	/**
	 * @param canjia the canjia to set
	 */
	public void setCanjia(String canjia) {
		this.canjia = canjia;
	}
	/**
	 * @return the jiage
	 */
	public Double getJiage() {
		return jiage;
	}
	/**
	 * @param jiage the jiage to set
	 */
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [pinpai=" + pinpai + ", canjia=" + canjia + ", jiage=" + jiage + "]";
	}
	
	
	
	
	
	

}
