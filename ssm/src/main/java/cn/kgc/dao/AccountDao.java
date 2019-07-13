package cn.kgc.dao;

import cn.kgc.domain.User;
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
    @Select("select *  from user")
     public List<User> findAll();

    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public int saveAccount(User user);

    //更新账户信息
    @Insert("update account set money=#{money} where name =#{name}")
    public  int updateAccount(User user);

    //查询账户  byname
    @Select("select * from account where name =#{name}")
    public User findAccountByName(String name);

    //删除账户
    @Delete("delete from account where name =#{name}")
    public int delAccount(String name);
}
