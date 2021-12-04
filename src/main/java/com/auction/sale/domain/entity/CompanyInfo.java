package com.auction.sale.domain.entity;

public class CompanyInfo {
    private Integer id;

    private String companyName;

    private String companyRemark;

    private String companyAddress;

    private Integer phoneNumber;

    private String loginName;

    private String password;

    private String authorization;

    private String companyCertificate;

    private String organizationCertificate;

    private String salaryCertificate;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getCompanyName() {
        return companyName;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }


    public String getCompanyRemark() {
        return companyRemark;
    }


    public void setCompanyRemark(String companyRemark) {
        this.companyRemark = companyRemark == null ? null : companyRemark.trim();
    }


    public String getCompanyAddress() {
        return companyAddress;
    }


    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }


    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization == null ? null : authorization.trim();
    }

    public String getCompanyCertificate() {
        return companyCertificate;
    }

    public void setCompanyCertificate(String companyCertificate) {
        this.companyCertificate = companyCertificate == null ? null : companyCertificate.trim();
    }

    public String getOrganizationCertificate() {
        return organizationCertificate;
    }

    public void setOrganizationCertificate(String organizationCertificate) {
        this.organizationCertificate = organizationCertificate == null ? null : organizationCertificate.trim();
    }

    public String getSalaryCertificate() {
        return salaryCertificate;
    }

    public void setSalaryCertificate(String salaryCertificate) {
        this.salaryCertificate = salaryCertificate == null ? null : salaryCertificate.trim();
    }
}