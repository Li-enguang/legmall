package com.leg.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.utils.PageUtils;
import com.leg.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:40:13
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

