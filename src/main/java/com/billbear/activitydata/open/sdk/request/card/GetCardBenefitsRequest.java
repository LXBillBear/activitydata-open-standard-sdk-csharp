package com.billbear.activitydata.open.sdk.request.card;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.response.card.GetCardBenefitsResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetCardBenefitsRequest extends BaseRequest<GetCardBenefitsResponse> {

 
	private Integer cardId;                 
    
 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
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
		return "card/getCardBenefits";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("card_id", this.getCardId());
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetCardBenefitsResponse> getResponseClass() {
		return GetCardBenefitsResponse.class;
	}

}	