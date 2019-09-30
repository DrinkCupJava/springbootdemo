package com.hcx.springbootdemo.controller;

import com.hcx.springbootdemo.model.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @RequestMapping(value = "showUserInfo",method = RequestMethod.GET)
    public UserInfo showUser(HttpServletRequest request){
        UserInfo userInfo=new UserInfo();
        userInfo.setName("hh");
        userInfo.setAge("18");
        HttpSession session = request.getSession();
        session.setAttribute("userInfo",userInfo);
        return (UserInfo) session.getAttribute("userInfo");
    }

}
