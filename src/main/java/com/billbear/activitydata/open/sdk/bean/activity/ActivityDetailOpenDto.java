package com.billbear.activitydata.open.sdk.bean.activity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Date;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ActivityDetailOpenDto{

 
	
	@JsonProperty("id")	
	private String id;                 
    
 
	
	@JsonProperty("title")	
	private String title;                 
    
 
	
	@JsonProperty("content")	
	private String content;                 
    
 
	
	@JsonProperty("bigImgUrl")	
	private String bigImgUrl;                 
    
 
	
	@JsonProperty("bankName")	
	private String bankName;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("startDate")	
	private Date startDate;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("endDate")	
	private Date endDate;                 
    
 
	
	@JsonProperty("category1")	
	private String category1;                 
    
 
	
	@JsonProperty("category2")	
	private String category2;                 
    
 
	
	@JsonProperty("type")	
	private String type;                 
    
 
	
	@JsonProperty("payment")	
	private String payment;                 
    
 
	
	@JsonProperty("payBrand")	
	private String payBrand;                 
    
 
	
	@JsonProperty("availableTime")	
	private String availableTime;                 
    
 
	
	@JsonProperty("availableCity")	
	private String availableCity;                 
    
 
	
	@JsonProperty("subjectDescription")	
	private String subjectDescription;                 
    
 
	
	@JsonProperty("way")	
	private String way;                 
    
 
	
	@JsonProperty("note")	
	private String note;                 
    
 
	
	@JsonProperty("subjectType")	
	private String subjectType;                 
    

 
	
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
    
 
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
    
 
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}                
    
 
	
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}                
    
 
	
	public String getPayBrand() {
		return payBrand;
	}

	public void setPayBrand(String payBrand) {
		this.payBrand = payBrand;
	}                
    
 
	
	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}                
    
 
	
	public String getAvailableCity() {
		return availableCity;
	}

	public void setAvailableCity(String availableCity) {
		this.availableCity = availableCity;
	}                
    
 
	
	public String getSubjectDescription() {
		return subjectDescription;
	}

	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}                
    
 
	
	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}                
    
 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}                
    
 
	
	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}                
    

}