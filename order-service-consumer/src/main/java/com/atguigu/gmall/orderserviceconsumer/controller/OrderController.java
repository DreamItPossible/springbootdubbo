package com.atguigu.gmall.orderserviceconsumer.controller;

import gmall.bean.UserAddress;
import gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/20 15:45
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(String userId){
        return orderService.init(userId);
    }

}
