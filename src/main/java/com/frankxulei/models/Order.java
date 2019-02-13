package com.frankxulei.models;

import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 *@author: Frank Xu Lei
 *@date: 20190202
 *@time: 上午12:41:54
 *@fileName: Order.java
 *@ClassName: Order
 */
@ApiModel(description = "All details about the Orders. ")
public class Order {

	private int id;	
	private String title;
	private Double price;
	private String address;
	private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
