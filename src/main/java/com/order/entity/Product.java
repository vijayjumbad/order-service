package com.order.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer productid;
	public String name;
	public Integer price;
	public Integer stockquantity;
//	 @ManyToOne
//	  @JoinColumn(name = "order_id")
//	public OrderEntity entity;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStockquantity() {
		return stockquantity;
	}
	public void setStockquantity(Integer stockquantity) {
		this.stockquantity = stockquantity;
	}
	

}
