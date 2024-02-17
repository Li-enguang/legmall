package com.leg.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.utils.PageUtils;
import com.leg.ware.entity.WareInfoEntity;
import com.leg.ware.vo.FareVo;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:41:32
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取运费和收货地址信息
     * @param addrId
     * @return
     */
    FareVo getFare(Long addrId);
}

