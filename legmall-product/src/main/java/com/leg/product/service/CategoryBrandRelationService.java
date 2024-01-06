package com.leg.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.utils.PageUtils;
import com.leg.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 18:46:15
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

