package org.atmc.restaurantbackend.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "orders")

public class OrderEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4096332186582661695L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String oDescription;
	@Column
	private String oInstructions;
	@Column
	private String oQuantity;
	@Column
	private String oPrice;
	@Column
	private String oUserId;
	@Column
	private int oProductId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
