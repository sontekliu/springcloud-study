package com.javaliu.cloud.feign;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描 述：  TODO
 * 类 名：FeignClient
 * 作 者：liushijun
 * 创 建：2019年05月25日 15:11:00
 * 版 本：V1.0.0
 */
@org.springframework.cloud.openfeign.FeignClient(value = "my-service-01")
public interface FeignClient{

    @RequestMapping(value = "/test/findService",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String findService(@RequestParam("name")String name);
}
