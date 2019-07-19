package cn.kgc.controller;

import cn.kgc.dao.RechargeAmout;
import cn.kgc.domain.*;
import cn.kgc.service.RechargeAmoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/query")
@CrossOrigin
public class QueryVipController {

    @Autowired
    RechargeAmoutService rechargeAmoutService;

    @RequestMapping("/findmber")
    @ResponseBody
    @CrossOrigin
    public List<Member> queryV1(){
        return rechargeAmoutService.InFormation();
    }


    @RequestMapping("/finduser")
    @ResponseBody
    @CrossOrigin
    public List<User> queryV2(){
        return rechargeAmoutService.findUser();
    }
    @RequestMapping("/findamout")
    @ResponseBody
    @CrossOrigin
    public List<EandV> findAVE(){
        return rechargeAmoutService.findAVE();
    }
}
