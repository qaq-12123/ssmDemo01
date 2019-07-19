package cn.kgc.dao;

import cn.kgc.domain.Onclient;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OnclientDao {
    @Select("SELECT u.username,u.phone,o.orderStatue,v.license,v.safety_peril from  `order` as o\n" +
            "INNER JOIN `user` as u on u.id=o.uid\n" +
            "inner join `vehicle` as v on o.vid=v.id")
    //查询在线客户okok
    public List<Onclient> findAll();
}
