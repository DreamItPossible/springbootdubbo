package com.atguigu.gmall.orderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class OrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceConsumerApplication.class, args);
	}

}

