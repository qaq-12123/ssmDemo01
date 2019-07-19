package cn.kgc.service.impl;

import cn.kgc.dao.AccountDao;
import cn.kgc.domain.City;
import cn.kgc.domain.Orders;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<City> findAllCity() {
        return accountDao.findAllCity();
    }

    @Override
    public List<Orders> findAllOrders() {
        return accountDao.findAllOrders();
    }

}
