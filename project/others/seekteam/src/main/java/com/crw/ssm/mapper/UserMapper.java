package com.crw.ssm.mapper;

import com.crw.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    public List<User> findAll();
    //查找用户，实现用户登陆
    public User login(String username,String password);
    //用户注册
    public void register(User user);
}
