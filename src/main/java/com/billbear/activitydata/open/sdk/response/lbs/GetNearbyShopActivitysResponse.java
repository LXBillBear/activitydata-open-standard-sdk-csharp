package com.billbear.activitydata.open.sdk.response.lbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.lbs.ShopActivityOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetNearbyShopActivitysResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ShopActivityOpenDto> data;                 
    

 

  	
	public List<ShopActivityOpenDto> getData() {
		return data;
	}

	public void setData(List<ShopActivityOpenDto> data) {
		this.data = data;
	}                
    

}