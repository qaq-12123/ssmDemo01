package cn.kgc.service;

import cn.kgc.domain.City;
import cn.kgc.domain.Order;

import java.util.List;

/**
 * 业务层接口
 */
public interface CityService {

    //查询所有城市
    public List<City> findAllCity();

    //查询订单信息
    public List<Order> findAllOrders();
}
