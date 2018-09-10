package com.billbear.activitydata.open.sdk.request.article;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Long;
import com.billbear.activitydata.open.sdk.response.article.GetArticleResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetArticleRequest extends BaseRequest<GetArticleResponse> {

 
	private Long id;                 
    

 

  	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "article/getArticle";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("id", this.getId());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetArticleResponse> getResponseClass() {
		return GetArticleResponse.class;
	}

}	