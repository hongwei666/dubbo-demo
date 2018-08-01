package com.provider.service.impl;

import com.api.service.UserService;

public class UserServiceImpl implements UserService {
    public String getName(int userId) {
        return "dubbo提供的服务"+userId;
    }
}
