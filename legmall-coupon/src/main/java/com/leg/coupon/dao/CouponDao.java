package com.leg.coupon.dao;

import com.leg.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 20:51:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
