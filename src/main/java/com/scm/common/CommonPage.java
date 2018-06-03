package com.scm.common;

public class CommonPage {
	private Integer pageNum;
	private Integer pageSize;
	
	public CommonPage(){}
	
	public CommonPage(Integer pageNum,Integer pageSize){
		this.pageNum = pageNum == null?1:pageNum;
		this.pageSize = pageSize == null?10:pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
