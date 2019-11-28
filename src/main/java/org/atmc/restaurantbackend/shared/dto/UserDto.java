package org.atmc.restaurantbackend.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private static final long serialVersionUID = -5366465825102661266L;

	private String uId;
	private String uName;
	private String uEmail;
	private String uPassword;
	private String uPhoneNo;
	private String uAddress;

	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuPhoneNo() {
		return uPhoneNo;
	}
	public void setuPhoneNo(String uPhoneNo) {
		this.uPhoneNo = uPhoneNo;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	
	
}
