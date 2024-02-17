package com.leg.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leg.product.entity.SkuSaleAttrValueEntity;
import com.leg.product.vo.SkuItemSaleAttrVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku销售属性&值
 * 
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 18:46:15
 */
@Mapper
public interface SkuSaleAttrValueDao extends BaseMapper<SkuSaleAttrValueEntity> {

    List<SkuItemSaleAttrVo> getSaleAttrBySpuId(@Param("spuId") Long spuId);

    List<String> getSkuSaleAttrValuesAsStringList(@Param("skuId") Long skuId);
}
