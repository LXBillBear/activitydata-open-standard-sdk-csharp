package com.billbear.activitydata.open.sdk.response.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityCategoryOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetActivityTypesResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ActivityCategoryOpenDto> data;                 
    

 

  	
	public List<ActivityCategoryOpenDto> getData() {
		return data;
	}

	public void setData(List<ActivityCategoryOpenDto> data) {
		this.data = data;
	}                
    

}