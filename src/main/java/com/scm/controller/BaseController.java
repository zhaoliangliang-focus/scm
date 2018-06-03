package com.scm.controller;

import com.scm.common.CommonPage;

public class BaseController {
	
	public CommonPage wrapePage(Integer pageNum,Integer pageSize){
		return new CommonPage(pageNum,pageSize);
	}

}
