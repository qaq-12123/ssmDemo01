package cn.kgc.service.impl;

import cn.kgc.dao.CarrentDao;
import cn.kgc.domain.Costinfo;
import cn.kgc.domain.Order;
import cn.kgc.domain.Vehicle;
import cn.kgc.service.CarrentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarrentServiceImpl implements CarrentService {
    @Autowired
    CarrentDao carrentDao;

    //    查询金额表costinfo所有数据
    @Override
    public List<Costinfo> findAllCostinfo() {
        return carrentDao.findAllCostinfo();
    }

    //    查询订单表order所有数据
    @Override
    public List<Order> findAllOrder() {
        return carrentDao.findAllOrder();
    }

    //    查询车辆信息表vehicle所有数据
    @Override
    public List<Vehicle> findAllVehicle() {
        return carrentDao.findAllVehicle();
    }
}
