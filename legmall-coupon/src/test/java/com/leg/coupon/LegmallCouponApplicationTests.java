package com.leg.coupon;

import com.leg.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LegmallCouponApplicationTests {

    @Autowired
    CouponService couponService;
    @Test
    void contextLoads() {
    }

}
