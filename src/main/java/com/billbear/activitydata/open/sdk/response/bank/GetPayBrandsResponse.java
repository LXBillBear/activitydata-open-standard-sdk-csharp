package com.billbear.activitydata.open.sdk.response.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.bank.PayBrandOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetPayBrandsResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<PayBrandOpenDto> data;                 
    

 

  	
	public List<PayBrandOpenDto> getData() {
		return data;
	}

	public void setData(List<PayBrandOpenDto> data) {
		this.data = data;
	}                
    

}