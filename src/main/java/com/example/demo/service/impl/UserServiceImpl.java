package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.impl.UserMapper;
import com.example.demo.service.IUserService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:44
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements IUserService{


    private static Map<String,User> sessionMap = new HashMap<>();

    @Autowired
    private UserMapper userMapper;
    @Override
    public String login(User user) {

        User u = this.userMapper.login(user);
        if(null == u) return null;
        String sessionId = UUID.randomUUID().toString().replace("-","");
        return sessionId;
    }
}
