package com.billbear.activitydata.open.sdk.bean.bank;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.bean.bank.CardLevelOpenDto;
import java.util.List;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class CardBrandOpenDto{

 
	
	@JsonProperty("name")	
	private String name;                 
    
 
	
	@JsonProperty("nameEn")	
	private String nameEn;                 
    
 
	
	@JsonProperty("logoUrl")	
	private String logoUrl;                 
    
 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("cardLevelDtos")	
	private List<CardLevelOpenDto> cardLevelDtos;                 
    

 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}                
    
 
	
	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
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
    
 
	
	public List<CardLevelOpenDto> getCardLevelDtos() {
		return cardLevelDtos;
	}

	public void setCardLevelDtos(List<CardLevelOpenDto> cardLevelDtos) {
		this.cardLevelDtos = cardLevelDtos;
	}                
    

}