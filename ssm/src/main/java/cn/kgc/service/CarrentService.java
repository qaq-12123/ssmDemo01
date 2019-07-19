package cn.kgc.service;

import cn.kgc.domain.Costinfo;
import cn.kgc.domain.Order;
import cn.kgc.domain.Vehicle;

import java.util.List;

public interface CarrentService {
    //    金额表数据
    public List<Costinfo> findAllCostinfo();

    //    订单表数据
    public List<Order> findAllOrder();

    //    订单表数据
    public List<Vehicle> findAllVehicle();
}
