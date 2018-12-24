package com.atguigu.gmall.config;

import com.alibaba.dubbo.config.*;
import gmall.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/22 12:28
 */
@Configuration
public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

//     <dubbo:protocol name="dubbo" port="20880" />
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

//      <dubbo:service interface="gmall.service.UserService" ref="userServiceImpl01" timeout="1000"
//    version="1.0.0"/>
    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig<UserService> userServiceServiceConfig = new ServiceConfig<>();
        userServiceServiceConfig.setInterface(UserService.class);
        userServiceServiceConfig.setRef(userService);
        userServiceServiceConfig.setVersion("1.0.0");
        //配置每个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        List<MethodConfig> methodConfigList = new ArrayList<>();
        methodConfigList.add(methodConfig);
        userServiceServiceConfig.setMethods(methodConfigList);

        return userServiceServiceConfig;
    }


}
