package com.zyd.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author solomon
 * @date 2018/12/11 011 17:58
 */
@Configuration
public class SysConfig {
    public static String hello;

    @Value("${zyd.hello}")
    public void setHello(String hello) {
        this.hello = hello;
    }
}
