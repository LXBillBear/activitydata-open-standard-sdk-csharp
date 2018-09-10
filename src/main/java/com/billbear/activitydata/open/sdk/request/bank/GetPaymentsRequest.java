package com.billbear.activitydata.open.sdk.request.bank;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.bank.GetPaymentsResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetPaymentsRequest extends BaseRequest<GetPaymentsResponse> {


	
	@Override
	public String getApiMethod() {
		return "bank/getPayments";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetPaymentsResponse> getResponseClass() {
		return GetPaymentsResponse.class;
	}

}	