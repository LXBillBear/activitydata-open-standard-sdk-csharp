package com.billbear.activitydata.open.sdk.request.bank;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.bank.GetPayBrandsResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetPayBrandsRequest extends BaseRequest<GetPayBrandsResponse> {


	
	@Override
	public String getApiMethod() {
		return "bank/getPayBrands";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetPayBrandsResponse> getResponseClass() {
		return GetPayBrandsResponse.class;
	}

}	