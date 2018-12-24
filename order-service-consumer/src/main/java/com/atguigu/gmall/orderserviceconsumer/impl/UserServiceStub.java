package com.atguigu.gmall.orderserviceconsumer.impl;

import gmall.bean.UserAddress;
import gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/21 13:00
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        if (StringUtils.isEmpty(userId)){
            System.out.println("本地存根调用了、、、");
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
