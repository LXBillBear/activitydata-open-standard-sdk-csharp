package com.billbear.activitydata.open.sdk.bean.activity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityCategoryOpenDto;
import java.util.List;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ActivityCategoryListOpenDto{

 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("name")	
	private String name;                 
    
 
	
	@JsonProperty("children")	
	private List<ActivityCategoryOpenDto> children;                 
    

 
	
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
    
 
	
	public List<ActivityCategoryOpenDto> getChildren() {
		return children;
	}

	public void setChildren(List<ActivityCategoryOpenDto> children) {
		this.children = children;
	}                
    

}