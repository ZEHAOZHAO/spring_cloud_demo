package com.zhzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: jason.zhao
 * @date:2019/11/14 16:47
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GetWayClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetWayClientApplication.class);
    }
}
