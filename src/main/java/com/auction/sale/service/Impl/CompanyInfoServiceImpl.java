package com.auction.sale.service.Impl;

import com.auction.sale.domain.entity.CompanyInfo;
import com.auction.sale.mapper.CompanyInfoMapper;
import com.auction.sale.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyInfoMapper companyInfoMapper;

    @Override
    public CompanyInfo login(String loginName, String password) {
        return companyInfoMapper.getUserInfo(loginName,password);
    }
}
