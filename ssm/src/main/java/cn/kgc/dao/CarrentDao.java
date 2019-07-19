package cn.kgc.dao;

import cn.kgc.domain.Costinfo;
import cn.kgc.domain.Order;
import cn.kgc.domain.Vehicle;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarrentDao {
//    金额表数据
    @Select("select * from costinfo")
    public List<Costinfo> findAllCostinfo();

//    订单表数据
    @Select("select * from `order`")
    public List<Order> findAllOrder();

    //    订单表数据
    @Select("select * from vehicle")
    public List<Vehicle> findAllVehicle();
}
