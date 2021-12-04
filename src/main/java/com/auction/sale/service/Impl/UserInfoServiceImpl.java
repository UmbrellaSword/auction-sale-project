package com.auction.sale.service.Impl;

import com.auction.sale.domain.entity.UserInfo;
import com.auction.sale.mapper.UserInfoMapper;
import com.auction.sale.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo login(String loginName, String password) {
        return userInfoMapper.getUserInfo(loginName, password);
    }

    @Override
    public Boolean register(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo) > 0;
    }
}
