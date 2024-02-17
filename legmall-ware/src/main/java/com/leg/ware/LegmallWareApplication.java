package com.leg.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.leg.ware.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class LegmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegmallWareApplication.class, args);
    }

}
