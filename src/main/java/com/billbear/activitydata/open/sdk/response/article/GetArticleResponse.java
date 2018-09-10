package com.billbear.activitydata.open.sdk.response.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.billbear.activitydata.open.sdk.bean.article.ArticleDetailOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetArticleResponse extends BaseResponse {

    
    @JsonProperty("data")
	private ArticleDetailOpenDto data;                 
    

 

  	
	public ArticleDetailOpenDto getData() {
		return data;
	}

	public void setData(ArticleDetailOpenDto data) {
		this.data = data;
	}                
    

}