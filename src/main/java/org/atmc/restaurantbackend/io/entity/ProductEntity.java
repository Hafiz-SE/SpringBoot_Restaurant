package org.atmc.restaurantbackend.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Products")
public class ProductEntity implements Serializable{
		private static final long serialVersionUID = -81049035831842339L;
		
		@Id
		@GeneratedValue
		private long id;
		@Column
		private String pName;
		@Column
		private String pPrice;
		@Column
		private int pStock;
		@Column
		private int pCategory;
		@Column
		private String pImg;
		
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
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		
	

}
