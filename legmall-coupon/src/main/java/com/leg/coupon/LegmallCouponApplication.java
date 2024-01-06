package com.leg.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@SpringBootApplication
public class LegmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegmallCouponApplication.class, args);
    }

}
