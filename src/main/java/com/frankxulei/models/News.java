package com.frankxulei.models;

import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 *@author: Frank Xu Lei
 *@date: 20181228
 *@time: 上午12:41:54
 *@fileName: News.java
 *@ClassName: News
 */
@ApiModel(description = "All details about the News. ")
public class News {

	private int id;	
	private String title;
	private String content;
	private String tags;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	
	
}
