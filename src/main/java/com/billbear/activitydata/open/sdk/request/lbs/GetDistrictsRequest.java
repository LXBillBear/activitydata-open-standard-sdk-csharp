package com.billbear.activitydata.open.sdk.request.lbs;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.response.lbs.GetDistrictsResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetDistrictsRequest extends BaseRequest<GetDistrictsResponse> {

 
	private Integer cityId;                 
    
 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}                
    
 

  	
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}                
    
 

  	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "LBS/getDistricts";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("city_id", this.getCityId());
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetDistrictsResponse> getResponseClass() {
		return GetDistrictsResponse.class;
	}

}	