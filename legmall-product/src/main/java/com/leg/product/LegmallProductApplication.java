package com.leg.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@EnableFeignClients(basePackages = "com.leg.product.feign")
@EnableDiscoveryClient
@MapperScan("com.leg.product.dao")
@SpringBootApplication
public class LegmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegmallProductApplication.class, args);
    }

}
