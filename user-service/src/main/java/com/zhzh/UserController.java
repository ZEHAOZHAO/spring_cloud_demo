package com.zhzh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jason.zhao
 * @date:2019/11/14 16:19
 * @Description:
 */
@RestController
public class UserController {
    @GetMapping("/hi")
    public String hi() {
        return "hi zipkin";
    }
}
