package com.auction.sale.mapper;

import com.auction.sale.domain.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo getUserInfo(@Param("userName") String userName,@Param("password") String password);
}