package cn.yunhe.dao;

import cn.yunhe.pojo.Order;

public interface OrderMapper {

    /**
     * 查询订单的时候，同时查询出用户
     */
    Order findOrderAndUserById(int oid);
}
