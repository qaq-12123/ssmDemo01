package cn.kgc.service.impl;

import cn.kgc.dao.AccountDao;
import cn.kgc.domain.Account;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findAllByName(String name) {
        return accountDao.findAccountByName(name);
    }

    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public int updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public int delAccount(String name) {
        return accountDao.delAccount(name);
    }

    @Override
    public int transfer(String newName, String oldName, double money) throws Exception  {
        int count = 0;
        Account acc1 = accountDao.findAccountByName(newName);
        Account acc2 = accountDao.findAccountByName(oldName);
        acc1.setMoney(acc1.getMoney()-money);
        acc2.setMoney(acc2.getMoney()+money);
        int i = updateAccount(acc1);
//        int a = 1/0;
        int i1 = updateAccount(acc2);
        count = i+i1;
        System.out.println("影响行数:"+count);
        return count;
    }
}
