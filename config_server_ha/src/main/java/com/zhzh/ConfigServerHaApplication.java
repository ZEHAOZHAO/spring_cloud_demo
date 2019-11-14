package com.zhzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jason.zhao
 * @date:2019/11/14 14:18
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerHaApplication.class);
    }
}
