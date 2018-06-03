package com.scm.mapper;

import com.scm.model.ScmProdSkuDefine;

public interface ScmProdSkuDefineMapper {
    int deleteByPrimaryKey(Integer skuId);

    int insert(ScmProdSkuDefine record);

    int insertSelective(ScmProdSkuDefine record);

    ScmProdSkuDefine selectByPrimaryKey(Integer skuId);

    int updateByPrimaryKeySelective(ScmProdSkuDefine record);

    int updateByPrimaryKey(ScmProdSkuDefine record);
}