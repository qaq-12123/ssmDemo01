package cn.kgc.service.impl;

import cn.kgc.dao.FindOrdersDao;
import cn.kgc.domain.FindOrders;
import cn.kgc.service.FindOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindOrdersServiceImpl implements FindOrdersService {
    @Autowired
    FindOrdersDao findOrdersDao;
    @Override
    public List<FindOrders> findorders() {
        return findOrdersDao.findorders();
    }
}
