package com.auction.sale.mapper;

import com.auction.sale.domain.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    int insertSelective(UserInfo record);

    List<UserInfo> getUserInfo();
}