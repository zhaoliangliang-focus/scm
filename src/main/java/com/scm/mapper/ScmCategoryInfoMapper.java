package com.scm.mapper;

import com.scm.model.ScmCategoryInfo;

public interface ScmCategoryInfoMapper {
    int deleteByPrimaryKey(Integer catId);

    int insert(ScmCategoryInfo record);

    int insertSelective(ScmCategoryInfo record);

    ScmCategoryInfo selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(ScmCategoryInfo record);

    int updateByPrimaryKey(ScmCategoryInfo record);
}