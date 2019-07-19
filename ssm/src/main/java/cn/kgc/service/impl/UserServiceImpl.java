package cn.kgc.service.impl;

import cn.kgc.dao.UserDao;
import cn.kgc.domain.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    /**
     * @param
     * @return fan返回user对象
     */
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    //  登录
    @Override
    public boolean loginUser(User user) {
        User user1 = userDao.loginUser(user);
        if(user1 != null){
            return true;
        }
        return false;
    }


    // 注册
    @Override
    public boolean saveUser(User user) {
        User user1 = userDao.queryPhone(user.getPhone());
        if(user1 != null){
            return false;
        }else {
            boolean boo=userDao.saveUser(user)>0?true:false;
            return boo;
        }
    }
}
