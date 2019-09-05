package com.crw.ssm.service.impl;

import com.crw.ssm.mapper.UserMapper;
import com.crw.ssm.entity.User;
import com.crw.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username,String password) {
        return userMapper.login(username,password);
    }

    @Override
    public void register(User user) {
        userMapper.register(user);
    }
}
