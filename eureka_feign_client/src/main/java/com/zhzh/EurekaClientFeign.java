package com.zhzh;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: jason.zhao
 * @date:2019/10/29 16:24
 * @Description:
 */
@FeignClient(value = "eureka-client",configuration = FeignClientConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {

    @GetMapping("/hi")
     String sayHi();
}
