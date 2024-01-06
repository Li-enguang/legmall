package com.leg.product.dao;

import com.leg.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 18:46:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
