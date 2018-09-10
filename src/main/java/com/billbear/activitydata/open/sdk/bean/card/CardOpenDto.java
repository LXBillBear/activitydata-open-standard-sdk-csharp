package com.billbear.activitydata.open.sdk.bean.card;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class CardOpenDto{

 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("annualFee")	
	private String annualFee;                 
    
 
	
	@JsonProperty("annualFeeRule")	
	private String annualFeeRule;                 
    
 
	
	@JsonProperty("bankName")	
	private String bankName;                 
    
 
	
	@JsonProperty("cardBrandName")	
	private String cardBrandName;                 
    
 
	
	@JsonProperty("name")	
	private String name;                 
    
 
	
	@JsonProperty("cardLevel")	
	private String cardLevel;                 
    
 
	
	@JsonProperty("currency")	
	private String currency;                 
    
 
	
	@JsonProperty("imgUrl")	
	private String imgUrl;                 
    
 
	
	@JsonProperty("pointValidityDescription")	
	private String pointValidityDescription;                 
    
 
	
	@JsonProperty("pointRule")	
	private String pointRule;                 
    
 
	
	@JsonProperty("interestFreePeriod")	
	private String interestFreePeriod;                 
    
 
	
	@JsonProperty("hotlines")	
	private String hotlines;                 
    
 
	
	@JsonProperty("minRepaymentDescription")	
	private String minRepaymentDescription;                 
    
 
	
	@JsonProperty("issueZones")	
	private String issueZones;                 
    

 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}                
    
 
	
	public String getAnnualFee() {
		return annualFee;
	}

	public void setAnnualFee(String annualFee) {
		this.annualFee = annualFee;
	}                
    
 
	
	public String getAnnualFeeRule() {
		return annualFeeRule;
	}

	public void setAnnualFeeRule(String annualFeeRule) {
		this.annualFeeRule = annualFeeRule;
	}                
    
 
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}                
    
 
	
	public String getCardBrandName() {
		return cardBrandName;
	}

	public void setCardBrandName(String cardBrandName) {
		this.cardBrandName = cardBrandName;
	}                
    
 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}                
    
 
	
	public String getCardLevel() {
		return cardLevel;
	}

	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}                
    
 
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}                
    
 
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}                
    
 
	
	public String getPointValidityDescription() {
		return pointValidityDescription;
	}

	public void setPointValidityDescription(String pointValidityDescription) {
		this.pointValidityDescription = pointValidityDescription;
	}                
    
 
	
	public String getPointRule() {
		return pointRule;
	}

	public void setPointRule(String pointRule) {
		this.pointRule = pointRule;
	}                
    
 
	
	public String getInterestFreePeriod() {
		return interestFreePeriod;
	}

	public void setInterestFreePeriod(String interestFreePeriod) {
		this.interestFreePeriod = interestFreePeriod;
	}                
    
 
	
	public String getHotlines() {
		return hotlines;
	}

	public void setHotlines(String hotlines) {
		this.hotlines = hotlines;
	}                
    
 
	
	public String getMinRepaymentDescription() {
		return minRepaymentDescription;
	}

	public void setMinRepaymentDescription(String minRepaymentDescription) {
		this.minRepaymentDescription = minRepaymentDescription;
	}                
    
 
	
	public String getIssueZones() {
		return issueZones;
	}

	public void setIssueZones(String issueZones) {
		this.issueZones = issueZones;
	}                
    

}