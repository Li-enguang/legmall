package com.leg.order.dao;

import com.leg.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:40:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
