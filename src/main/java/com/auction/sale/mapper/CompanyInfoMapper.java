package com.auction.sale.mapper;

import com.auction.sale.domain.entity.CompanyInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoMapper {

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo getUserInfo(@Param("loginName") String loginName,@Param("password") String password);
}