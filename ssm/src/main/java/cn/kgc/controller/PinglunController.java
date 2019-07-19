package cn.kgc.controller;

import cn.kgc.domain.Pinglun;
import cn.kgc.service.PinglunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/18  16:46
 */
@Controller
@RequestMapping("/test")
public class PinglunController {
    @Autowired
    private PinglunService pinglunService;
    @RequestMapping("findAll")
    @ResponseBody
    public List findAll(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(pinglunService.findAll());
        return arrayList;
    }
    @RequestMapping("/pinglun")
    @ResponseBody
    public boolean pinglun(Pinglun pinglun){
        if(pinglun!=null){
            return pinglunService.ping(pinglun);
        }
       return false;

    }



}
