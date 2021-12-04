package com.auction.sale.service;

import com.auction.sale.domain.entity.CompanyInfo;

public interface CompanyInfoService {
    CompanyInfo login(String loginName, String password);

    Boolean register(CompanyInfo companyInfo);
}
