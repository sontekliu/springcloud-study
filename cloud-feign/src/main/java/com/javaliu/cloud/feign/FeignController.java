package com.javaliu.cloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描 述：  TODO
 * 类 名：FeignController
 * 作 者：liushijun
 * 创 建：2019年05月25日 15:11:00
 * 版 本：V1.0.0
 */
@RestController
public class FeignController {

    @Autowired
    private FeignClient feignClient;

    @RequestMapping(value = "test")
    public String test(){
        String service = feignClient.findService("zhangsan");
        System.out.println(service);
        return "test";
    }

}
