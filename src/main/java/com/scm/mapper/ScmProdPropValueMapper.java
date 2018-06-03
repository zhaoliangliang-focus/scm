package com.scm.mapper;

import com.scm.model.ScmProdPropValue;

public interface ScmProdPropValueMapper {
    int deleteByPrimaryKey(Integer propValueId);

    int insert(ScmProdPropValue record);

    int insertSelective(ScmProdPropValue record);

    ScmProdPropValue selectByPrimaryKey(Integer propValueId);

    int updateByPrimaryKeySelective(ScmProdPropValue record);

    int updateByPrimaryKey(ScmProdPropValue record);
}