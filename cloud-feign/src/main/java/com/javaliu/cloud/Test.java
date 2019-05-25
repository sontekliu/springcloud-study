package com.javaliu.cloud;

import com.javaliu.cloud.feign.FeignClient;
import feign.Feign;

/**
 * 描 述：  TODO
 * 类 名：Test
 * 作 者：liushijun
 * 创 建：2019年05月25日 16:41:00
 * 版 本：V1.0.0
 */
public class Test {
    public static void main(String[] args) {
        FeignClient feignClient = Feign.builder().target(FeignClient.class,
                "http://localhost:8090/test/findService");
        feignClient.findService("aaaa");
    }
}
