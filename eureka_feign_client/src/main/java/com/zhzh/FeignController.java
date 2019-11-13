package com.zhzh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jason.zhao
 * @date:2019/10/29 16:33
 * @Description:
 */
@RestController
public class FeignController {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @GetMapping("/hi")
    public String hi(){
        return eurekaClientFeign.sayHi();
    }
}
