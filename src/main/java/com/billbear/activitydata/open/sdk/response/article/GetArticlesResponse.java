package com.billbear.activitydata.open.sdk.response.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.article.ArticleOpenDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetArticlesResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ArticleOpenDto> data;                 
    

 

  	
	public List<ArticleOpenDto> getData() {
		return data;
	}

	public void setData(List<ArticleOpenDto> data) {
		this.data = data;
	}                
    

}