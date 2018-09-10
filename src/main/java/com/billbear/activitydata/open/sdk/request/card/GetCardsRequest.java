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

 
	private String ids;                 
    
 
	private Integer bankId;                 
    
 
	private Integer cardBrandId;                 
    
 
	private Integer cardLevelId;                 
    
 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}                
    
 

  	
	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}                
    
 

  	
	public Integer getCardBrandId() {
		return cardBrandId;
	}

	public void setCardBrandId(Integer cardBrandId) {
		this.cardBrandId = cardBrandId;
	}                
    
 

  	
	public Integer getCardLevelId() {
		return cardLevelId;
	}

	public void setCardLevelId(Integer cardLevelId) {
		this.cardLevelId = cardLevelId;
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
	    map.put("ids", this.getIds());
	    map.put("bank_id", this.getBankId());
	    map.put("card_brand_id", this.getCardBrandId());
	    map.put("card_level_id", this.getCardLevelId());
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetCardsResponse> getResponseClass() {
		return GetCardsResponse.class;
	}

}	