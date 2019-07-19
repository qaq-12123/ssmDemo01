package cn.kgc.controller;

import cn.kgc.domain.Onclient;
import cn.kgc.service.OnclientService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//在线客户
@Controller
@RequestMapping("/onclient")
@CrossOrigin
public class OnclientController {
    @Autowired
    OnclientService onclientService;
    @RequestMapping("/getonclient")
    public void getonclient(HttpServletRequest request, HttpServletResponse response){
        //调用dao层的方法查询到集合
        response.setCharacterEncoding("utf-8");
        List<Onclient> all = onclientService.findAll();
        Map<String,List>map=new HashMap<>();
        //把list集合放到map键值对里
        map.put("onclient",all);
        String string = JSON.toJSONString(map,true);
        PrintWriter writer =null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write(string);
        writer.flush();
        writer.close();
    }
}
