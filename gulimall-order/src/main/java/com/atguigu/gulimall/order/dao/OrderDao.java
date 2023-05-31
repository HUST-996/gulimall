package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangyuming
 * @email 1278921534@qq.com
 * @date 2023-05-28 21:58:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
