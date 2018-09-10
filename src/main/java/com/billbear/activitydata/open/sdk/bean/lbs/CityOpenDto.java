package com.billbear.activitydata.open.sdk.bean.lbs;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class CityOpenDto{

 
	
	@JsonProperty("cityId")	
	private Integer cityId;                 
    
 
	
	@JsonProperty("cityName")	
	private String cityName;                 
    
 
	
	@JsonProperty("adCode")	
	private String adCode;                 
    
 
	
	@JsonProperty("cityCode")	
	private String cityCode;                 
    

 
	
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}                
    
 
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}                
    
 
	
	public String getAdCode() {
		return adCode;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}                
    
 
	
	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}                
    

}