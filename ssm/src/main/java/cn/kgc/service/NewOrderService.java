package cn.kgc.service;

import cn.kgc.domain.Accountes;

import java.util.List;

public interface NewOrderService {
    //查询最新订单
    public List<Accountes> findneworder();

}
