package com.example.demo.mapper.impl;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:45
 * @Version 1.0
 **/
@Repository
public class UserMapper {

    public User login(User user){

        if(!"lizhitao".equals(user.getUsername())){
            return null;
        }
        return user;
    }
}
