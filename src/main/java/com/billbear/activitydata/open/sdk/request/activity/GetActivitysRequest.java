package com.billbear.activitydata.open.sdk.request.activity;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.activity.GetActivitysResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetActivitysRequest extends BaseRequest<GetActivitysResponse> {


	
	@Override
	public String getApiMethod() {
		return "activity/getActivitys";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetActivitysResponse> getResponseClass() {
		return GetActivitysResponse.class;
	}

}	