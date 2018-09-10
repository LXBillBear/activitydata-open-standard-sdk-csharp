package com.billbear.activitydata.open.sdk.response.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.card.CardOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetCardsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<CardOpenDto> data;                 
    

 

  	
	public List<CardOpenDto> getData() {
		return data;
	}

	public void setData(List<CardOpenDto> data) {
		this.data = data;
	}                
    

}