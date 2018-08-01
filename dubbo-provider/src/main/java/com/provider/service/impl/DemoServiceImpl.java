package com.provider.service.impl;

import com.api.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello"+name;
    }
}
