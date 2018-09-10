package com.billbear.activitydata.open.sdk.bean.activity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Date;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ActivityOpenDto{

 
	
	@JsonProperty("id")	
	private String id;                 
    
 
	
	@JsonProperty("title")	
	private String title;                 
    
 
	
	@JsonProperty("bigImgUrl")	
	private String bigImgUrl;                 
    
 
	
	@JsonProperty("bankName")	
	private String bankName;                 
    
 
	
	@JsonProperty("category1")	
	private String category1;                 
    
 
	
	@JsonProperty("category2")	
	private String category2;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("startDate")	
	private Date startDate;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("endDate")	
	private Date endDate;                 
    
 
	
	@JsonProperty("availableTime")	
	private String availableTime;                 
    
 
	
	@JsonProperty("type")	
	private String type;                 
    

 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}                
    
 
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}                
    
 
	
	public String getBigImgUrl() {
		return bigImgUrl;
	}

	public void setBigImgUrl(String bigImgUrl) {
		this.bigImgUrl = bigImgUrl;
	}                
    
 
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}                
    
 
	
	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}                
    
 
	
	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}                
    
 
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}                
    
 
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}                
    
 
	
	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}                
    
 
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}                
    

}