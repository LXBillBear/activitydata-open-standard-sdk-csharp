package com.billbear.activitydata.open.sdk.request.activity;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.activity.GetActivityTypesResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetActivityTypesRequest extends BaseRequest<GetActivityTypesResponse> {


	
	@Override
	public String getApiMethod() {
		return "activity/getActivityTypes";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetActivityTypesResponse> getResponseClass() {
		return GetActivityTypesResponse.class;
	}

}	