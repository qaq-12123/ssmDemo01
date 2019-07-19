package cn.kgc.service.impl;

import cn.kgc.dao.CityDao;
import cn.kgc.domain.City;
import cn.kgc.domain.Order;
import cn.kgc.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public List<Order> findAllOrders() {
        return cityDao.findAllOrders();
    }

}
