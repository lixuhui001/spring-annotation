package com.lxh.consume.service.impl;

import com.lxh.consume.entity.User;
import com.lxh.consume.service.UserService;
import com.lxh.spring.annotation.UVService;

/*
 * @author uv
 * @date 2018/9/29 10:38
 *
 */
@UVService
public class UserServiceImpl implements UserService {
 
    public User getUser() {
        User user = new User("1", "Tom",18);
        return user;
    }
 
}