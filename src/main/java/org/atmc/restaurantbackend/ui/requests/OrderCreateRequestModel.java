package org.atmc.restaurantbackend.ui.requests;

public class OrderCreateRequestModel {
	
	private String o_description;
	private String o_instructions;
	private String o_quantity;
	private String o_price;
	private String o_u_id;
	private int o_p_id;
	
	
	public String getO_description() {
		return o_description;
	}
	public void setO_description(String o_description) {
		this.o_description = o_description;
	}
	public String getO_instructions() {
		return o_instructions;
	}
	public void setO_instructions(String o_instructions) {
		this.o_instructions = o_instructions;
	}
	public String getO_quantity() {
		return o_quantity;
	}
	public void setO_quantity(String o_quantity) {
		this.o_quantity = o_quantity;
	}
	public String getO_price() {
		return o_price;
	}
	public void setO_price(String o_price) {
		this.o_price = o_price;
	}
	public String getO_u_id() {
		return o_u_id;
	}
	public void setO_u_id(String o_u_id) {
		this.o_u_id = o_u_id;
	}
	public int getO_p_id() {
		return o_p_id;
	}
	public void setO_p_id(int o_p_id) {
		this.o_p_id = o_p_id;
	}
	
	
}
