package org.atmc.restaurantbackend.shared.dto;

import java.io.Serializable;

public class OrderDto implements Serializable {

	private static final long serialVersionUID = 6825076829491623862L;
	
	private String oDescription;
	private String oInstructions;
	private String oQuantity;
	private String oPrice;
	private String oUserId;
	private int oProductId;
	
	public String getoDescription() {
		return oDescription;
	}
	public void setoDescription(String oDescription) {
		this.oDescription = oDescription;
	}
	public String getoInstructions() {
		return oInstructions;
	}
	public void setoInstructions(String oInstructions) {
		this.oInstructions = oInstructions;
	}
	public String getoQuantity() {
		return oQuantity;
	}
	public void setoQuantity(String oQuantity) {
		this.oQuantity = oQuantity;
	}
	public String getoPrice() {
		return oPrice;
	}
	public void setoPrice(String oPrice) {
		this.oPrice = oPrice;
	}
	public String getoUserId() {
		return oUserId;
	}
	public void setoUserId(String oUserId) {
		this.oUserId = oUserId;
	}
	public int getoProductId() {
		return oProductId;
	}
	public void setoProductId(int oProductId) {
		this.oProductId = oProductId;
	}
	
	
}
