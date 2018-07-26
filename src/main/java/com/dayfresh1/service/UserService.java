package com.dayfresh1.service;

import com.dayfresh1.mapper.UserMapper;
import com.dayfresh1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public int register(User user) {
        return userMapper.insertSelective(user);
    }

    public User check(String userName) {
        return userMapper.selectOne(userName);
    }

    public User checkEmail(String email) {
        return userMapper.selectEmail(email);
    }
}
