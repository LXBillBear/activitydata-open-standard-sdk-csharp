package com.billbear.activitydata.open.sdk.bean.card;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class CardBenefitOpenDto{

 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("title")	
	private String title;                 
    
 
	
	@JsonProperty("content")	
	private String content;                 
    
 
	
	@JsonProperty("category1")	
	private String category1;                 
    
 
	
	@JsonProperty("category2")	
	private String category2;                 
    
 
	
	@JsonProperty("zoneInclude")	
	private String zoneInclude;                 
    
 
	
	@JsonProperty("availableTime")	
	private String availableTime;                 
    
 
	
	@JsonProperty("usageCount")	
	private Integer usageCount;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("startDate")	
	private Date startDate;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("endDate")	
	private Date endDate;                 
    
 
	
	@JsonProperty("instruction")	
	private String instruction;                 
    
 
	
	@JsonProperty("periodType")	
	private String periodType;                 
    
 
	
	@JsonProperty("benefitType")	
	private String benefitType;                 
    

 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
    
 
	
	public String getZoneInclude() {
		return zoneInclude;
	}

	public void setZoneInclude(String zoneInclude) {
		this.zoneInclude = zoneInclude;
	}                
    
 
	
	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}                
    
 
	
	public Integer getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(Integer usageCount) {
		this.usageCount = usageCount;
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
    
 
	
	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}                
    
 
	
	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}                
    
 
	
	public String getBenefitType() {
		return benefitType;
	}

	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}                
    

}