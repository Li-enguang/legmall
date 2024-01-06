package com.leg.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.utils.PageUtils;
import com.leg.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:40:13
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

