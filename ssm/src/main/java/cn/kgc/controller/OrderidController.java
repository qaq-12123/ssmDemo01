package cn.kgc.controller;

import cn.kgc.service.OrderidService;
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
import java.util.Map;
//获取下单总数
@Controller
@RequestMapping("/orderid")
@CrossOrigin
public class OrderidController {
    @Autowired
    private OrderidService orderidService;
    @RequestMapping("/getorderid")
    public void getorderid(HttpServletResponse response, HttpServletRequest request){
        int ordercount = orderidService.ordercount();
        Map<String,Integer> map=new HashMap<>();
         map.put("orderscount", ordercount);
        String string = JSON.toJSONString(map, true);
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
