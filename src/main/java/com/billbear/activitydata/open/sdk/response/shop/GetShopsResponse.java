package com.billbear.activitydata.open.sdk.response.shop;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.shop.ShopOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetShopsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ShopOpenDto> data;                 
    

 

  	
	public List<ShopOpenDto> getData() {
		return data;
	}

	public void setData(List<ShopOpenDto> data) {
		this.data = data;
	}                
    

}