package com.leg.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.leg.product.dao")
@SpringBootApplication
public class LegmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegmallProductApplication.class, args);
    }

}
