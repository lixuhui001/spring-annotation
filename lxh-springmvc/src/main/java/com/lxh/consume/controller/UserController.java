package com.lxh.consume.controller;

import com.lxh.consume.entity.User;
import com.lxh.consume.service.UserService;
import com.lxh.spring.annotation.UVAutowried;
import com.lxh.spring.annotation.UVController;
import com.lxh.spring.annotation.UVRequestMapping;
import com.lxh.spring.annotation.UVResponseBody;

/*
 * @author uv
 * @date 2018/9/29 10:46
 *
 */
@UVController
@UVRequestMapping("user")
public class UserController {
 
    @UVAutowried
    private UserService userService;
 
    @UVRequestMapping("user")
    @UVResponseBody
    public User getUser() {
        return userService.getUser();
    }
 
    @UVRequestMapping("hello")
    public String hello(String name) {
        return "hello";
    }
 
}