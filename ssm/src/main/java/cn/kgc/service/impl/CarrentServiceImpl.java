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
    @Override
    public List<Costinfo> findAllCostinfo() {
        return carrentDao.findAllCostinfo();
    }

    @Override
    public List<Order> findAllOrder() {
        return carrentDao.findAllOrder();
    }

    @Override
    public List<Vehicle> findAllVehicle() {
        return carrentDao.findAllVehicle();
    }
}
