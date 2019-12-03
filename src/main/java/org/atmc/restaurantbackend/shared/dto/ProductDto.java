package org.atmc.restaurantbackend.shared.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class ProductDto implements Serializable {

	private static final long serialVersionUID = 5354340558438238283L;
	
	String pName;
	String pPrice;
	int pStock;
	int pCategory;
	String pImg;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	public int getpStock() {
		return pStock;
	}
	public void setpStock(int pStock) {
		this.pStock = pStock;
	}
	public int getpCategory() {
		return pCategory;
	}
	public void setpCategory(int pCategory) {
		this.pCategory = pCategory;
	}
	public String getpImg() {
		return pImg;
	}
	public void setpImg(String pImg) {
		this.pImg = pImg;
	}
}
