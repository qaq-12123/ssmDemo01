package cn.kgc.service;

import cn.kgc.domain.User;
import java.util.List;

public interface UserService {

    /**
     * @return fan返回所有会员信息
     * */

    public List<User> findAll();



    /**
     * 登录  查询用户信息
     * @param user
     * @return
     */
    public boolean loginUser(User user);


    /**
     * 注册
     * @param user
     * @return
     */
    public boolean saveUser(User user);

}
