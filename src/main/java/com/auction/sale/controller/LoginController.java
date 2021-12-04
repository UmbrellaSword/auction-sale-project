package com.auction.sale.controller;

import com.auction.sale.domain.RestResponse;
import com.auction.sale.domain.entity.UserInfo;
import com.auction.sale.service.CompanyInfoService;
import com.auction.sale.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    CompanyInfoService companyInfoService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public RestResponse login(String loginName,String password){
       return RestResponse.buildSuccess(userInfoService.login(loginName,password));
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public RestResponse register(@RequestBody UserInfo userInfo){
        return RestResponse.buildSuccess(userInfoService.register(userInfo));
    }

    @RequestMapping(value = "loginByCompany",method = RequestMethod.GET)
    @ResponseBody
    public RestResponse loginByCompany(String loginName,String password){
        return RestResponse.buildSuccess(companyInfoService.login(loginName,password));
    }
}
