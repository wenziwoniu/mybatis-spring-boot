package com.vivebest.mybatis.spring.boot.entity;

import java.util.Date;

public class User {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String userCode;

    /**
     * 
     */
    private String loginName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private Integer sex;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private Integer userType;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private String organizationCode;

    /**
     * 
     */
    private String createName;

    /**
     * 
     */
    private String modifiedName;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getModifiedName() {
        return modifiedName;
    }

    public void setModifiedName(String modifiedName) {
        this.modifiedName = modifiedName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     *
     * @mbggenerated 2017-12-07
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" values are : ");
        sb.append("[");
        sb.append("HashCode = ").append(hashCode());
        sb.append(", id = ").append(id);
        sb.append(", userCode = ").append(userCode);
        sb.append(", loginName = ").append(loginName);
        sb.append(", password = ").append(password);
        sb.append(", userName = ").append(userName);
        sb.append(", sex = ").append(sex);
        sb.append(", age = ").append(age);
        sb.append(", phone = ").append(phone);
        sb.append(", userType = ").append(userType);
        sb.append(", status = ").append(status);
        sb.append(", organizationCode = ").append(organizationCode);
        sb.append(", createName = ").append(createName);
        sb.append(", modifiedName = ").append(modifiedName);
        sb.append(", createTime = ").append(createTime);
        sb.append(", modifiedTime = ").append(modifiedTime);
        sb.append("]");
        return sb.toString();
    }
}