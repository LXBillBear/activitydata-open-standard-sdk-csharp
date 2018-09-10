package com.billbear.activitydata.open.sdk.response.lbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.lbs.CityOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetCitysResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<CityOpenDto> data;                 
    

 

  	
	public List<CityOpenDto> getData() {
		return data;
	}

	public void setData(List<CityOpenDto> data) {
		this.data = data;
	}                
    

}