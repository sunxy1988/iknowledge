package cn.learn.mapp;

// Generated 2015-5-14 10:00:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AppWordTestItem generated by hbm2java
 */
public class AppWordTestItem implements java.io.Serializable {

	private Integer id;
	private Character itemCode;
	private String itemName;
	private Integer orderNum;
	private Integer timuId;
	private Date createTime;
	private Date updateTime;

	public AppWordTestItem() {
	}

	public AppWordTestItem(Character itemCode, String itemName,
			Integer orderNum, Integer timuId, Date createTime, Date updateTime) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.orderNum = orderNum;
		this.timuId = timuId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(Character itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getTimuId() {
		return this.timuId;
	}

	public void setTimuId(Integer timuId) {
		this.timuId = timuId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
