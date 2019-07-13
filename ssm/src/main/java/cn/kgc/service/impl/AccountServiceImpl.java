package cn.kgc.service.impl;

import cn.kgc.dao.AccountDao;
import cn.kgc.domain.User;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<User> findAll() {
        return accountDao.findAll();
    }

    @Override
    public User findAllByName(String name) {
        return accountDao.findAccountByName(name);
    }

    @Override
    public int saveAccount(User user) {
        return accountDao.saveAccount(user);
    }

    @Override
    public int updateAccount(User user) {
        return accountDao.updateAccount(user);
    }

    @Override
    public int delAccount(String name) {
        return accountDao.delAccount(name);
    }

    @Override
    public int transfer(String newName, String oldName, double money) throws Exception {
        return 0;
    }

}
