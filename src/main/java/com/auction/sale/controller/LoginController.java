package com.auction.sale.controller;

import com.auction.sale.domain.RestResponse;
import com.auction.sale.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public RestResponse Login(String userName,String password){
       return RestResponse.buildSuccess(userInfoService.login(userName,password));
    }
}
