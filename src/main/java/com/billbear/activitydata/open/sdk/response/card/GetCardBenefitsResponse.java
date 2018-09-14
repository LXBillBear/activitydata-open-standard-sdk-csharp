package com.billbear.activitydata.open.sdk.response.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.card.CardBenefitOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetCardBenefitsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<CardBenefitOpenDto> data;                 
    

 

  	
	public List<CardBenefitOpenDto> getData() {
		return data;
	}

	public void setData(List<CardBenefitOpenDto> data) {
		this.data = data;
	}                
    

}