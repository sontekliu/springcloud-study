package com.javaliu.cloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描 述：  TODO
 * 类 名：DiscoveryController
 * 作 者：liushijun
 * 创 建：2019年05月25日 14:57:00
 * 版 本：V1.0.0
 */
@RestController
@RequestMapping(value = "/test/")
public class DiscoveryController implements DiscoveryService{

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public String findService(String name){
        List<String> list = discoveryClient.getServices();
        list.forEach(item -> System.out.println(item));
        return "Hello World";
    }
}
