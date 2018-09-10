package com.billbear.activitydata.open.sdk.response.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.bank.CardBrandOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetCardBrandsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<CardBrandOpenDto> data;                 
    

 

  	
	public List<CardBrandOpenDto> getData() {
		return data;
	}

	public void setData(List<CardBrandOpenDto> data) {
		this.data = data;
	}                
    

}