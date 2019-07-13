package cn.kgc.service;

import cn.kgc.domain.Account;

import java.util.List;

/**
 * 业务层接口
 */
public interface AccountService {
    //查询所有账户信息
     List<Account> findAll();

    //查询所有账户信息
     Account findAllByName(String name);

    //保存账户信息
     int saveAccount(Account account);

    //更新账户信息
     int updateAccount(Account account);

     //删除信息
     public int delAccount(String name);

    //转账  byname
     int transfer(String newName,String oldName,double money) throws Exception;
}
