package cn.kgc.controller;

import cn.kgc.domain.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    @RequestMapping("/user")
    @CrossOrigin
    public class UserController {
        @Autowired
        UserService userService;
        //登录
        @RequestMapping("/loginUser")
        @ResponseBody
        public boolean loginUser(User user){
            return userService.loginUser(user);
        }

        // 注册
        @RequestMapping("/saveUser")
        @ResponseBody
        public boolean saveUser(User user){
            if(user.getPhone()!= null && user.getPassword() != null){
                return userService.saveUser(user);
            }
            return false;
        }
}
