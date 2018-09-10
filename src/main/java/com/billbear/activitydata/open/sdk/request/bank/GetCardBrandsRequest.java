package com.billbear.activitydata.open.sdk.request.bank;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.bank.GetCardBrandsResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetCardBrandsRequest extends BaseRequest<GetCardBrandsResponse> {


	
	@Override
	public String getApiMethod() {
		return "bank/getCardBrands";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetCardBrandsResponse> getResponseClass() {
		return GetCardBrandsResponse.class;
	}

}	