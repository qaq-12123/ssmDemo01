package cn.kgc.service;

import cn.kgc.domain.User;

import java.util.List;

/**
 * 业务层接口
 */
public interface AccountService {
    //查询所有账户信息
     List<User> findAll();

    //查询所有账户信息
    User findAllByName(String name);

    //保存账户信息
     int saveAccount(User user);

    //更新账户信息
     int updateAccount(User user);

     //删除信息
     public int delAccount(String name);

    //转账  byname
     int transfer(String newName,String oldName,double money) throws Exception;
}
