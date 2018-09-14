package com.billbear.activitydata.open.sdk.request.activity;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.String;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.response.activity.GetActivitysResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetActivitysRequest extends BaseRequest<GetActivitysResponse> {

 
	private String bankIds;                 
    
 
	private Integer cityId;                 
    
 
	private Integer categoryId;                 
    
 
	private Integer cardId;                 
    
 
	private Integer orderBy;                 
    
 
	private Integer paymentId;                 
    
 
	private Integer payBrandId;                 
    
 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
	public String getBankIds() {
		return bankIds;
	}

	public void setBankIds(String bankIds) {
		this.bankIds = bankIds;
	}                
    
 

  	
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}                
    
 

  	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}                
    
 

  	
	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}                
    
 

  	
	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}                
    
 

  	
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}                
    
 

  	
	public Integer getPayBrandId() {
		return payBrandId;
	}

	public void setPayBrandId(Integer payBrandId) {
		this.payBrandId = payBrandId;
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
		return "activity/getActivitys";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("bank_ids", this.getBankIds());
	    map.put("city_id", this.getCityId());
	    map.put("category_id", this.getCategoryId());
	    map.put("card_id", this.getCardId());
	    map.put("order_by", this.getOrderBy());
	    map.put("payment_id", this.getPaymentId());
	    map.put("pay_brand_id", this.getPayBrandId());
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetActivitysResponse> getResponseClass() {
		return GetActivitysResponse.class;
	}

}	