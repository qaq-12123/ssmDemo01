package cn.kgc.dao;

import cn.kgc.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层接口
 */
@Repository
public interface AccountDao {
    //查询所有账户信息
    @Select("select *  from account")
     public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public int saveAccount(Account account);

    //更新账户信息
    @Insert("update account set money=#{money} where name =#{name}")
    public  int updateAccount(Account account);

    //查询账户  byname
    @Select("select * from account where name =#{name}")
    public Account findAccountByName(String name);

    //删除账户
    @Delete("delete from account where name =#{name}")
    public int delAccount(String name);
}
