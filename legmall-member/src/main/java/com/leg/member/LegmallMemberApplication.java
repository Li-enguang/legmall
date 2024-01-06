package com.leg.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.leg.member.feign")
@SpringBootApplication
public class LegmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegmallMemberApplication.class, args);
    }

}
