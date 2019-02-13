package com.frankxulei.models;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: Frank Xu Lei
 * @date: 20181228
 * @time: 下午3:31:13
 * @fileName: Users.java
 * @ClassName: Users
 */
@ApiModel(description = "All details about the User. ")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes = "The database generated user ID")
	private long id;
	private String name;
	private String password;
	private int age;
	private String address;
	private String email;
	private Date createDate;
	private String mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
