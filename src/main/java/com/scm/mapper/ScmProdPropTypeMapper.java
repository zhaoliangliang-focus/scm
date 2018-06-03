package com.scm.mapper;

import com.scm.model.ScmProdPropType;

public interface ScmProdPropTypeMapper {
    int deleteByPrimaryKey(Integer propTypeId);

    int insert(ScmProdPropType record);

    int insertSelective(ScmProdPropType record);

    ScmProdPropType selectByPrimaryKey(Integer propTypeId);

    int updateByPrimaryKeySelective(ScmProdPropType record);

    int updateByPrimaryKey(ScmProdPropType record);
}