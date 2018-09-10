package com.billbear.activitydata.open.sdk.request.article;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.response.article.GetArticlesResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetArticlesRequest extends BaseRequest<GetArticlesResponse> {

 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
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
		return "article/getArticles";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetArticlesResponse> getResponseClass() {
		return GetArticlesResponse.class;
	}

}	