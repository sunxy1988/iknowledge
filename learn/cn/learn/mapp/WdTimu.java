package cn.learn.mapp;

// Generated 2015-5-14 10:00:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * WdTimu generated by hbm2java
 */
public class WdTimu implements java.io.Serializable {

	private Integer id;
	private Integer timuType;
	private String audio;
	private String timu;
	private String rightAns;
	private Integer wordId;
	private String word;
	private Integer testBookId;
	private String testBook;
	private Date createTime;
	private Date updateTime;

	public WdTimu() {
	}

	public WdTimu(Integer timuType, String audio, String timu, String rightAns,
			Integer wordId, String word, Integer testBookId, String testBook,
			Date createTime, Date updateTime) {
		this.timuType = timuType;
		this.audio = audio;
		this.timu = timu;
		this.rightAns = rightAns;
		this.wordId = wordId;
		this.word = word;
		this.testBookId = testBookId;
		this.testBook = testBook;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTimuType() {
		return this.timuType;
	}

	public void setTimuType(Integer timuType) {
		this.timuType = timuType;
	}

	public String getAudio() {
		return this.audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getTimu() {
		return this.timu;
	}

	public void setTimu(String timu) {
		this.timu = timu;
	}

	public String getRightAns() {
		return this.rightAns;
	}

	public void setRightAns(String rightAns) {
		this.rightAns = rightAns;
	}

	public Integer getWordId() {
		return this.wordId;
	}

	public void setWordId(Integer wordId) {
		this.wordId = wordId;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getTestBookId() {
		return this.testBookId;
	}

	public void setTestBookId(Integer testBookId) {
		this.testBookId = testBookId;
	}

	public String getTestBook() {
		return this.testBook;
	}

	public void setTestBook(String testBook) {
		this.testBook = testBook;
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
