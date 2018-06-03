package com.scm.model;

import java.util.Date;

public class ScmProdPropType {
    private Integer propTypeId;

    private Integer catId;

    private String catCode;

    private String prodTypeName;

    private Date addTime;

    private Date updateTime;

    public Integer getPropTypeId() {
        return propTypeId;
    }

    public void setPropTypeId(Integer propTypeId) {
        this.propTypeId = propTypeId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode == null ? null : catCode.trim();
    }

    public String getProdTypeName() {
        return prodTypeName;
    }

    public void setProdTypeName(String prodTypeName) {
        this.prodTypeName = prodTypeName == null ? null : prodTypeName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}