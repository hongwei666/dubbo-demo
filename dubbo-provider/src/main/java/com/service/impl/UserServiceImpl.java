package com.service.impl;

import com.api.UserService;

public class UserServiceImpl implements UserService {
    public String getName(int userId) {
        return "dubbo提供的new服务"+userId;
    }
}
