package cn.kgc.dao;

import cn.kgc.domain.Costinfo;
import cn.kgc.domain.Order;
import cn.kgc.domain.Vehicle;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarrentDao {
//    查询金额表costinfo所有数据
    @Select("select * from costinfo")
    public List<Costinfo> findAllCostinfo();

//    查询订单表order所有数据
    @Select("select * from `order`")
    public List<Order> findAllOrder();

    //    查询车辆信息表vehicle所有数据
    @Select("select * from vehicle")
    public List<Vehicle> findAllVehicle();
}
