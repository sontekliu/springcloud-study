package com.javaliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AppFeign {
    public static void main( String[] args ) {
        SpringApplication.run(AppFeign.class, args);
    }
}
