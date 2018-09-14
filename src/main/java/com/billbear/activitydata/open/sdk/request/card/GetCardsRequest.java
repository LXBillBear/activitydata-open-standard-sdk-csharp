package com.billbear.activitydata.open.sdk.request.card;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.String;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.response.card.GetCardsResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetCardsRequest extends BaseRequest<GetCardsResponse> {

 
	private String bankIds;                 
    
 
	private String cardBrandIds;                 
    
 
	private String cardLevelIds;                 
    
 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
	public String getBankIds() {
		return bankIds;
	}

	public void setBankIds(String bankIds) {
		this.bankIds = bankIds;
	}                
    
 

  	
	public String getCardBrandIds() {
		return cardBrandIds;
	}

	public void setCardBrandIds(String cardBrandIds) {
		this.cardBrandIds = cardBrandIds;
	}                
    
 

  	
	public String getCardLevelIds() {
		return cardLevelIds;
	}

	public void setCardLevelIds(String cardLevelIds) {
		this.cardLevelIds = cardLevelIds;
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
		return "card/getCards";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("bank_ids", this.getBankIds());
	    map.put("card_brand_ids", this.getCardBrandIds());
	    map.put("card_level_ids", this.getCardLevelIds());
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetCardsResponse> getResponseClass() {
		return GetCardsResponse.class;
	}

}	