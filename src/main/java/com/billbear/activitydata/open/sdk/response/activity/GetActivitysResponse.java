package com.billbear.activitydata.open.sdk.response.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetActivitysResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ActivityOpenDto> data;                 
    

 

  	
	public List<ActivityOpenDto> getData() {
		return data;
	}

	public void setData(List<ActivityOpenDto> data) {
		this.data = data;
	}                
    

}