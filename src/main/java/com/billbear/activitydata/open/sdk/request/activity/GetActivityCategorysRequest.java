package com.billbear.activitydata.open.sdk.request.activity;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.activity.GetActivityCategorysResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetActivityCategorysRequest extends BaseRequest<GetActivityCategorysResponse> {


	
	@Override
	public String getApiMethod() {
		return "activity/getActivityCategorys";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetActivityCategorysResponse> getResponseClass() {
		return GetActivityCategorysResponse.class;
	}

}	