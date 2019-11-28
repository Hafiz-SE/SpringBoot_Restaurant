package org.atmc.restaurantbackend.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -6147384092270471456L;
	
	@GeneratedValue
	@Id
	private long id;
	
	@Column
	private String uId;
	
	@Column(columnDefinition = "text")
	private String uName;
	
	@Column
    private String uEmail;
	
	@Column
	private String uPassword;
	
	@Column
	private String uPhoneNo;
	
	@Column
	private String uAddress;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

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

}
