package cn.kgc.service.impl;

import cn.kgc.dao.OrderDao;
import cn.kgc.dao.OrderidDao;
import cn.kgc.service.OrderidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderidServiceImpl implements OrderidService {
    @Autowired
    private OrderidDao orderidDao;
    @Override
    public int ordercount() {
        return orderidDao.ordercount();
    }
}
