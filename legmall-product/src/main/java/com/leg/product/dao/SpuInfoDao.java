package com.leg.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leg.product.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 * 
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 18:46:15
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void updaSpuStatus(@Param("spuId") Long spuId, @Param("code") int code);
}
