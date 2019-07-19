package cn.kgc.dao;

import cn.kgc.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /***************************后台*************************************/
    /**
     *
     * @return fan返回user对象
     * */
    @Select("select * from user")
    public List<User> findAll();

    /***************************移动端*************************************/
    /**
     * 登录  查询用户信息
     * @param user
     * @return
     */
    @Select("select id,phone,password from user where phone=#{phone} and password = #{password}")
    public User loginUser(User user);

    /**
     * 根据手机号查询用户是否已经存在
     * @param phone
     * @return
     */
    @Select("select * from user where phone=#{phone}")
    public User queryPhone(String phone);

    /**
     * 注册用户
     * @param user
     * @return
     */
    @Insert("insert into user (password,phone) values (#{password},#{phone})")
    public int saveUser(User user);


}
