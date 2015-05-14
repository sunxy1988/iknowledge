package cn.learn.mapp;

// Generated 2015-5-14 10:00:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * WdWordRoot generated by hbm2java
 */
public class WdWordRoot implements java.io.Serializable {

	private Integer id;
	private String word;
	private String definition;
	private Integer orderNum;
	private Date createTime;
	private Date updateTime;

	public WdWordRoot() {
	}

	public WdWordRoot(String word, String definition, Integer orderNum,
			Date createTime, Date updateTime) {
		this.word = word;
		this.definition = definition;
		this.orderNum = orderNum;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
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
