package com.billbear.activitydata.open.sdk.response.lbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.lbs.DistrictOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetDistrictsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<DistrictOpenDto> data;                 
    

 

  	
	public List<DistrictOpenDto> getData() {
		return data;
	}

	public void setData(List<DistrictOpenDto> data) {
		this.data = data;
	}                
    

}