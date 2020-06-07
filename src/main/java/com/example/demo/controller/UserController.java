package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.IUserService;
import com.example.demo.service.IViderService;
import com.example.demo.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:41
 * @Version 1.0
 **/
@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {





    @Autowired
    private IUserService iUserService;

    @PostMapping("login")
    public JsonUtil login(@RequestBody User user){
        System.out.println(user);
        String str = "";
        str.substring(2);
        String strr = "1";
        String  sessionId = this.iUserService.login(user);


        return sessionId == null ? JsonUtil.JsonError("账号密码错误") : JsonUtil.JsonSuccess(sessionId);
    }
}
