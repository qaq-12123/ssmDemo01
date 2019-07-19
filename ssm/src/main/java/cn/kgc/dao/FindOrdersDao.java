package cn.kgc.dao;

import cn.kgc.domain.FindOrders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FindOrdersDao {
    //查询下单okok
    @Select("select v.license,v.owner,o.orderStatue,o.orderstimes,o.createtime,o.indentmoney \n" +
            "from `order` as o\n" +
            "inner join `vehicle` as v  on o.vid=v.id order by createtime")
    public List<FindOrders> findorders();
}
