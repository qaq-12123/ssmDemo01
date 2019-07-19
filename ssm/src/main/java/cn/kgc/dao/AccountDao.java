package cn.kgc.dao;

import cn.kgc.domain.City;
import cn.kgc.domain.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层接口
 */
@Repository
public interface AccountDao {
    //查询所有城市
    @Select("select * from city")
     public List<City> findAllCity();

    //查询订单信息
    @Select("select * from `order` o,vehicle v where o.vid=v.id ")
    public List<Orders> findAllOrders();
}
