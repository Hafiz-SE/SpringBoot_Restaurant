package org.atmc.restaurantbackend.ui.requests;

import org.springframework.web.multipart.MultipartFile;

public class ProductCreateRequestModel {
	
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
	public ProductCreateRequestModel(String pName, String pPrice, int pStock, int pCategory) {
		this.pName = pName;
		this.pPrice = pPrice;
		this.pStock = pStock;
		this.pCategory = pCategory;
	}
	
	
}
