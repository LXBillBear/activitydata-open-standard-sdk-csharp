package com.billbear.activitydata.open.sdk.bean.activity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ActivityCategoryOpenDto{

 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("name")	
	private String name;                 
    

 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}                
    
 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}                
    

}