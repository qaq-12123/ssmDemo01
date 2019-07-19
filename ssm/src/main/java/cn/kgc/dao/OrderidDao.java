package cn.kgc.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 根据订单号id查询下单总数
 * */
@Repository
public interface OrderidDao {
    //根据订单号id查询下单总数
    @Select("select count(1) from `order`")
    public int ordercount();
}
