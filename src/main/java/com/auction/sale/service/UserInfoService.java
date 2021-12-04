package com.auction.sale.service;

import com.auction.sale.domain.entity.UserInfo;

import java.util.List;

public interface UserInfoService{
    UserInfo login(String loginName, String password);

    Boolean register(UserInfo userInfo);
}