package com.zyd.api.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author solomon
 * @date 2018/12/11 011 18:01
 */
@RestController
public class IndexController {
    @Value("${zyd.hello}")
    private String hello;
    @RequestMapping(value = "hello")
    public String hello(){
        return hello;
    }
}
