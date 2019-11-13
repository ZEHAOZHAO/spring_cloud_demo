package com.zhzh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jason.zhao
 * @date:2019/10/29 14:16
 * @Description:
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    //ribbon核心类  可以获取负载均衡器提供者实例的信息
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(){
        return ribbonService.hi();
    }

    @RequestMapping(value="/testRibbon",method=RequestMethod.GET)
    public String testRibbon(){
        ServiceInstance choose = loadBalancerClient.choose("eureka-client");

        return choose.getHost() + " "+ choose.getPort();
    }

    //关闭自动获取服务列表，手动维护服务地址
    @RequestMapping(value="/testRibbon01",method=RequestMethod.GET)
    public String testRibbon01(){
        ServiceInstance choose = loadBalancerClient.choose("stores");

        return choose.getHost() + " "+ choose.getPort();
    }
}
