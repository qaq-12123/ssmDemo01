package cn.kgc.controller;

import cn.kgc.domain.Member;
import cn.kgc.domain.User;
import cn.kgc.service.VEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/edit")
@CrossOrigin
public class VEditController {
    @Autowired
    VEditService vEditService;
    @ResponseBody
    @RequestMapping("/editphone")
    @CrossOrigin
    public boolean updatephone(String phone){
        if(phone!=null){
         return vEditService.editphone(phone);
        }
        return  false;
    }
    @ResponseBody
    @RequestMapping("/editbalance")
    @CrossOrigin
    public List updatemoney( float balance, String mname){
        List list= new ArrayList();
        if(balance!=0&&mname!=null){
             list.add(vEditService.balanceedit(balance,mname));
             return list;
        }
        return  null;
    }
    @ResponseBody
    @RequestMapping("/editmember")
    @CrossOrigin
    public boolean insertV(Member member){
        if(member!=null){
           return vEditService.insertV(member);
        }
        return false;
    }
    @ResponseBody
    @RequestMapping("/findAll")
    @CrossOrigin
    public List<Member> findAll(){
        return vEditService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findUser")
    @CrossOrigin
    public List<User> findUser(){
        return vEditService.findUser();
    }
}
