package com.scm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.scm.mapper.ScmCompanyInfoMapper;
import com.scm.model.ScmCompanyInfo;

@Service
public class ScmCompanyInfoService {
	
	@Autowired
	private ScmCompanyInfoMapper scmCompanyInfoMapper;
	
	public List<ScmCompanyInfo> getAllCompanysByPage(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return scmCompanyInfoMapper.selectAllCompanys();
	}
	

}
