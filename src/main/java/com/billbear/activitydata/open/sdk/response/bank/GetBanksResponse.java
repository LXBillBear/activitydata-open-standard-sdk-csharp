package com.billbear.activitydata.open.sdk.response.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.bank.BankOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetBanksResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<BankOpenDto> data;                 
    

 

  	
	public List<BankOpenDto> getData() {
		return data;
	}

	public void setData(List<BankOpenDto> data) {
		this.data = data;
	}                
    

}