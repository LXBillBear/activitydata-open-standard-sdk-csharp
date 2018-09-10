package com.billbear.activitydata.open.sdk.response.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityCategoryListOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetActivityCategorysResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ActivityCategoryListOpenDto> data;                 
    

 

  	
	public List<ActivityCategoryListOpenDto> getData() {
		return data;
	}

	public void setData(List<ActivityCategoryListOpenDto> data) {
		this.data = data;
	}                
    

}