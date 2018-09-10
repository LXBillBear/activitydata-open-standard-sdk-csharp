package com.billbear.activitydata.open.sdk.response.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.bank.PaymentOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetPaymentsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<PaymentOpenDto> data;                 
    

 

  	
	public List<PaymentOpenDto> getData() {
		return data;
	}

	public void setData(List<PaymentOpenDto> data) {
		this.data = data;
	}                
    

}