package com.scm.mapper;

import java.util.List;

import com.scm.model.ScmProductInfo;

public interface ScmProductInfoMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(ScmProductInfo record);

    int insertSelective(ScmProductInfo record);

    ScmProductInfo selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(ScmProductInfo record);

    int updateByPrimaryKey(ScmProductInfo record);
    
    List<ScmProductInfo> selectAllProducts();
}