package com.zhzh;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: jason.zhao
 * @date:2019/10/29 14:12
 * @Description:
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "errorInfo")
    public String hi(){
        return restTemplate.getForObject("http://eureka-client/hi",String.class);
    }

    public String errorInfo(){
        return "error！！！！";
    }
}
