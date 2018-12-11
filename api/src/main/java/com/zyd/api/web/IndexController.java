package com.zyd.api.web;

import com.zyd.api.common.ApiResult;
import com.zyd.api.common.Results;
import com.zyd.api.config.SysConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author solomon
 * @date 2018/12/11 011 18:01
 */
@RestController
public class IndexController {

    @RequestMapping(value = "hello")
    public ApiResult<String> hello(){
        return Results.success(SysConfig.hello);
    }
}
