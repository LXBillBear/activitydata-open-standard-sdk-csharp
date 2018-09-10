package com.billbear.activitydata.open.sdk.request.bank;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.bank.GetBanksResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetBanksRequest extends BaseRequest<GetBanksResponse> {


	
	@Override
	public String getApiMethod() {
		return "bank/getBanks";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetBanksResponse> getResponseClass() {
		return GetBanksResponse.class;
	}

}	