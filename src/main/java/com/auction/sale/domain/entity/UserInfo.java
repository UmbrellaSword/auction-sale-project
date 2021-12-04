package com.auction.sale.domain.entity;

public class UserInfo {

    private Integer id;

    private String userName;

    private String password;

    private Integer phoneNumber;

    private String address;

    private String cardUp;

    private String cardDown;

    private Integer isSuper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCardUp() {
        return cardUp;
    }

    public void setCardUp(String cardUp) {
        this.cardUp = cardUp == null ? null : cardUp.trim();
    }

    public String getCardDown() {
        return cardDown;
    }

    public void setCardDown(String cardDown) {
        this.cardDown = cardDown == null ? null : cardDown.trim();
    }

    public Integer getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }
}