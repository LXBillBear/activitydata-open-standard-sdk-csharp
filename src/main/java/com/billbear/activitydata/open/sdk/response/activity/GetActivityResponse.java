package com.billbear.activitydata.open.sdk.response.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityDetailOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetActivityResponse extends BaseResponse {

    
    @JsonProperty("data")
	private ActivityDetailOpenDto data;                 
    

 

  	
	public ActivityDetailOpenDto getData() {
		return data;
	}

	public void setData(ActivityDetailOpenDto data) {
		this.data = data;
	}                
    

}