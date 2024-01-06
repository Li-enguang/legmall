package com.leg.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.utils.PageUtils;
import com.leg.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:41:32
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

