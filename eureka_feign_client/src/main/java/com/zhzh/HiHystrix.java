package com.zhzh;

import org.springframework.stereotype.Component;

/**
 * @Author: jason.zhao
 * @date:2019/11/5 18:54
 * @Description:
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHi() {
        return "error!!!!";
    }
}
