package com.crw.ssm.controller;

import com.crw.ssm.entity.User;
import com.crw.ssm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Api("User接口")

@Controller
@RequestMapping("html")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("用户注册")
    //用户注册
    @PostMapping("register")
    public String register(User user){
        ModelAndView modelAndView = new ModelAndView();
        userService.register(user);
        return "redirect:index";
    }
    @ApiOperation("用户登陆")
    //用户登陆
    @PostMapping("login")
    public ModelAndView login(@ApiParam(name = "username", value = "用户名", required = true)
                              @RequestParam(name = "username", required = true)
                                @PathVariable String username,
                              @ApiParam(name = "password", value = "密码", required = true)
                              @RequestParam(name = "password", required = true)
                                @PathVariable String password){
        ModelAndView modelAndView = new ModelAndView();
        if(userService.login(username,password)!=null){  //用户存在，则登陆成功
            modelAndView.addObject("username",username);
            modelAndView.setViewName("index");
            return modelAndView;
        }else{  //用户不存在，返回登陆页面
            modelAndView.addObject("msg","用户名或密码不对");
            modelAndView.setViewName("login");
            return modelAndView;
        }
    }
}