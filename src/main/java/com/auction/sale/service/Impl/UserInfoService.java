package com.auction.sale.service.Impl;

import com.auction.sale.domain.entity.UserInfo;

import java.util.List;

public interface UserInfoService{
    UserInfo login(String userName, String password);
}