package com.atguigu.gmall.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import gmall.bean.UserAddress;
import gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/19 20:25
 */
@Component
@Service //暴露服务
public class UserServiceImpl implements UserService {

    @HystrixCommand
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl:......1...." );
       UserAddress address1 = new UserAddress(1,"西安高新区锦业路","1","小强","1101","公司");
       UserAddress address2 = new UserAddress(2,"西安新城区火车站","1","coco","1102","家");
//       if (Math.random()>0.5){
//           throw new RuntimeException();
//       }
        return Arrays.asList(address1,address2);
    }
}
