package com.zhzh;

import feign.Retryer;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.l;

/**
 * @Author: jason.zhao
 * @date:2019/10/29 16:26
 * @Description:
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
