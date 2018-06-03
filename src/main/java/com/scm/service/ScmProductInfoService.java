package com.scm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.scm.mapper.ScmProductInfoMapper;
import com.scm.model.ScmProductInfo;

@Service
public class ScmProductInfoService {
	
	@Autowired
	private ScmProductInfoMapper scmProductInfoMapper;
	
	public List<ScmProductInfo> getAllProductsByPage(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return scmProductInfoMapper.selectAllProducts();
	}
	

}
