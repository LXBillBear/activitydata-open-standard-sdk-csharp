package com.billbear.activitydata.open.sdk.request.lbs;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.lbs.GetCitysResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetCitysRequest extends BaseRequest<GetCitysResponse> {


	
	@Override
	public String getApiMethod() {
		return "LBS/getCitys";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetCitysResponse> getResponseClass() {
		return GetCitysResponse.class;
	}

}	