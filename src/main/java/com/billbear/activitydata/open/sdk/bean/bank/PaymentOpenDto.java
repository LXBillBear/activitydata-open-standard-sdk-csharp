package com.billbear.activitydata.open.sdk.bean.bank;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class PaymentOpenDto{

 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("nameCn")	
	private String nameCn;                 
    

 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}                
    
 
	
	public String getNameCn() {
		return nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}                
    

}