package com.auction.sale.service;

import com.auction.sale.domain.entity.UserInfo;
import com.auction.sale.mapper.UserInfoMapper;
import com.auction.sale.service.Impl.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfo() {
        return userInfoMapper.getUserInfo();
    }
}
