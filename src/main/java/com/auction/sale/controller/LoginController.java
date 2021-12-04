package com.auction.sale.controller;

import com.auction.sale.domain.RestResponse;
import com.auction.sale.domain.entity.UserInfo;
import com.auction.sale.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public RestResponse login(String userName,String password){
       return RestResponse.buildSuccess(userInfoService.login(userName,password));
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public RestResponse register(@RequestBody UserInfo userInfo){
        return RestResponse.buildSuccess(userInfoService.register(userInfo));
    }
}
