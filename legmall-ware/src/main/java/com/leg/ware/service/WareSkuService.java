package com.leg.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leg.common.to.OrderTo;
import com.leg.common.to.mq.StockLockedTo;
import com.leg.common.utils.PageUtils;
import com.leg.ware.entity.WareSkuEntity;
import com.leg.ware.vo.SkuHasStockVo;
import com.leg.ware.vo.WareSkuLockVo;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:41:32
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 添加库存
     * @param skuId
     * @param wareId
     * @param skuNum
     */
    void addStock(Long skuId, Long wareId, Integer skuNum);

    /**
     * 判断是否有库存
     * @param skuIds
     * @return
     */
    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);

    /**
     * 锁定库存
     * @param vo
     * @return
     */
    boolean orderLockStock(WareSkuLockVo vo);


    /**
     * 解锁库存
     * @param to
     */
    void unlockStock(StockLockedTo to);

    /**
     * 解锁订单
     * @param orderTo
     */
    void unlockStock(OrderTo orderTo);
}

