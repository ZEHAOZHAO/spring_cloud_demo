package com.zhzh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jason.zhao
 * @date:2019/11/13 16:40
 * @Description:
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class ConfigClientApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConfigClientApplication.class);
    }

    @Value("${foo}")
    String foo;

    @GetMapping("/foo")
    public String getFoo() {
        return foo;
    }
}
