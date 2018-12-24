package com.atguigu.gmall.orderserviceconsumer.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import gmall.bean.UserAddress;
import gmall.service.OrderService;
import gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/19 20:38
 */
@Service
public class OrderServiceImpl implements OrderService {
//    @Autowired
    @Reference(loadbalance = "random")
    UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    public List<UserAddress> init(String userId) {
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println("用户Id为"+userId +"的地址列表：" + addressList);
        return addressList;
    }

    public List<UserAddress> hello(String userId) {
        return Arrays.asList(new UserAddress(3, "测试地址", "1", "出错了", "1101", "哎"));
    }
}
