package com.billbear.activitydata.open.sdk.bean.bank;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.lang.Integer;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class BankOpenDto{

 
	
	@JsonProperty("name")	
	private String name;                 
    
 
	
	@JsonProperty("logoUrl")	
	private String logoUrl;                 
    
 
	
	@JsonProperty("id")	
	private Integer id;                 
    

 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}                
    
 
	
	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}                
    
 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}                
    

}