package com.scm.model;

import java.util.Date;

public class ScmProdPropValue {
    private Integer propValueId;

    private String propValueName;

    private Integer propTypeId;

    private String application;

    private Date addTime;

    private Date updateTime;

    public Integer getPropValueId() {
        return propValueId;
    }

    public void setPropValueId(Integer propValueId) {
        this.propValueId = propValueId;
    }

    public String getPropValueName() {
        return propValueName;
    }

    public void setPropValueName(String propValueName) {
        this.propValueName = propValueName == null ? null : propValueName.trim();
    }

    public Integer getPropTypeId() {
        return propTypeId;
    }

    public void setPropTypeId(Integer propTypeId) {
        this.propTypeId = propTypeId;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
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