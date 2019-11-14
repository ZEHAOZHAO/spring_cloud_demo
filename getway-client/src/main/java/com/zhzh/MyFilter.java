package com.zhzh;

import com.netflix.zuul.ZuulFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;

/**
 * @Author: jason.zhao
 * @date:2019/11/14 17:07
 * @Description:
 */
@Component
public class MyFilter extends ZuulFilter {
    @Autowired
    Tracer tracer;
    @Override
    public String filterType() {
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        Span currentSpan = tracer.getCurrentSpan();
        long traceId = currentSpan.getTraceId();
        System.out.println(traceId);
        return null;
    }
}
