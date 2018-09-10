package com.billbear.activitydata.open.sdk.bean.lbs;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class DistrictOpenDto{

 
	
	@JsonProperty("Id")	
	private Integer Id;                 
    
 
	
	@JsonProperty("name")	
	private String name;                 
    
 
	
	@JsonProperty("adCode")	
	private String adCode;                 
    

 
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}                
    
 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}                
    
 
	
	public String getAdCode() {
		return adCode;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}                
    

}