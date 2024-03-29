package com.leg.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.utils.PageUtils;
import com.leg.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 18:46:15
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

