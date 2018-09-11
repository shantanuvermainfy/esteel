package com.estel.services.usermanagment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserType {
    @Id
    private Integer userTypeId;
    private String userTypeName;
    private String userTypeDesc;

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getUserTypeDesc() {
        return userTypeDesc;
    }

    public void setUserTypeDesc(String userTypeDesc) {
        this.userTypeDesc = userTypeDesc;
    }
}
