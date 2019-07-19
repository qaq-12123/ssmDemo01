package cn.kgc.service.impl;

import cn.kgc.dao.NewOrderDao;
import cn.kgc.domain.Accountes;
import cn.kgc.service.NewOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewOrderServiceImpl implements NewOrderService {
    @Autowired
    NewOrderDao newOrderDao;
    @Override
    public List<Accountes> findneworder() {
        return newOrderDao.findneworder();
    }

}
