package org.atmc.restaurantbackend.response;

public class OrderResponse {
	
	private String oUserId;
	private String oProductId;
	private String oQuantity;
	private String oInstructions;
	private String oPrice;
	
	public String getoUserId() {
		return oUserId;
	}
	public void setoUserId(String oUserId) {
		this.oUserId = oUserId;
	}
	public String getoProductId() {
		return oProductId;
	}
	public void setoProductId(String oProductId) {
		this.oProductId = oProductId;
	}
	public String getoQuantity() {
		return oQuantity;
	}
	public void setoQuantity(String oQuantity) {
		this.oQuantity = oQuantity;
	}
	public String getoInstructions() {
		return oInstructions;
	}
	public void setoInstructions(String oInstructions) {
		this.oInstructions = oInstructions;
	}
	public String getoPrice() {
		return oPrice;
	}
	public void setoPrice(String oPrice) {
		this.oPrice = oPrice;
	}
	


	
	
}
