package com.javaliu.cloud.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描 述：  TODO
 * 类 名：DiscoveryService
 * 作 者：liushijun
 * 创 建：2019年05月25日 16:01:00
 * 版 本：V1.0.0
 */
public interface DiscoveryService {

    @RequestMapping(value = "findService", method = RequestMethod.GET)
    String findService(String name);
}
