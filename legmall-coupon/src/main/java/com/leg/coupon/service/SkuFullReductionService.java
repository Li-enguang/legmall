package com.leg.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.to.SkuReductionTo;
import com.leg.common.utils.PageUtils;
import com.leg.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 20:51:32
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

