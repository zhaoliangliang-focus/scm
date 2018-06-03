package com.scm.mapper;

import java.util.List;

import com.scm.model.ScmCompanyInfo;

public interface ScmCompanyInfoMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(ScmCompanyInfo record);

    int insertSelective(ScmCompanyInfo record);

    ScmCompanyInfo selectByPrimaryKey(Integer comId);

    int updateByPrimaryKeySelective(ScmCompanyInfo record);

    int updateByPrimaryKey(ScmCompanyInfo record);
    
    List<ScmCompanyInfo> selectAllCompanys();
}