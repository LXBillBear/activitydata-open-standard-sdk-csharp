package com.billbear.activitydata.open.sdk.bean.article;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ArticleDetailOpenDto{

 
	
	@JsonProperty("id")	
	private Integer id;                 
    
 
	
	@JsonProperty("title")	
	private String title;                 
    
 
	
	@JsonProperty("breviary")	
	private String breviary;                 
    
 
	
	@JsonProperty("content")	
	private String content;                 
    
 
	
	@JsonProperty("imageUrl")	
	private String imageUrl;                 
    
 
	
	@JsonProperty("isTop")	
	private Integer isTop;                 
    
 
	
	@JsonProperty("category")	
	private String category;                 
    
 
	
	@JsonProperty("initiatorBanks")	
	private String initiatorBanks;                 
    
 
	
	@JsonProperty("initiatorCardBrands")	
	private String initiatorCardBrands;                 
    
 
	
	@JsonProperty("source")	
	private Integer source;                 
    
 
	
	@JsonProperty("authorName")	
	private String authorName;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss, locale=zh")
	@JsonProperty("createTime")	
	private Date createTime;                 
    

 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}                
    
 
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}                
    
 
	
	public String getBreviary() {
		return breviary;
	}

	public void setBreviary(String breviary) {
		this.breviary = breviary;
	}                
    
 
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}                
    
 
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}                
    
 
	
	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}                
    
 
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}                
    
 
	
	public String getInitiatorBanks() {
		return initiatorBanks;
	}

	public void setInitiatorBanks(String initiatorBanks) {
		this.initiatorBanks = initiatorBanks;
	}                
    
 
	
	public String getInitiatorCardBrands() {
		return initiatorCardBrands;
	}

	public void setInitiatorCardBrands(String initiatorCardBrands) {
		this.initiatorCardBrands = initiatorCardBrands;
	}                
    
 
	
	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}                
    
 
	
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}                
    
 
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}                
    

}