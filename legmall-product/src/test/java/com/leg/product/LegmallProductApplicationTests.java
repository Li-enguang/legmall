package com.leg.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leg.product.entity.BrandEntity;
import com.leg.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LegmallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
//        BrandEntity entity = new BrandEntity();
//        entity.setDescript("1");
//        entity.setName("6华为");
//
//        brandService.save(entity);
//        System.out.println(66666);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(r -> System.out.println(r));
    }

}
