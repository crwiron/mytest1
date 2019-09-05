package com.crw.ssm.service;

import com.crw.ssm.entity.User;

import java.util.List;

public interface UserService {
    //用户登陆
    public User login(String username,String password);
    //用户注册
    public void register(User user);
}