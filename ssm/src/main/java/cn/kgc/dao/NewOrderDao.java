package cn.kgc.dao;

import cn.kgc.domain.Accountes;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *这是查询最新订单ok0k
 */
public interface NewOrderDao {
    @Select("select u.identity,u.phone,o.returnStore,o.colleationStore,v.license,o.orderStatue,o.createtime,v.`owner`,\n" +
            "o.orderstimes,o.indentmoney \n" +
            "from `order` as o\n" +
            "inner join `user` as u on u.id=o.uid\n" +
            "inner join `vehicle` as v on v.id=o.vid")
    public List<Accountes> findneworder();
}