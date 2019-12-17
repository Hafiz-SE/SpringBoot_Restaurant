package org.atmc.restaurantbackend.ui.requests;

public class UserSignInRequestModel {
	private String uName;
	private String uPassword;
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	
}
