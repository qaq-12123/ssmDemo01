package cn.kgc.controller;

import cn.kgc.domain.FindOrders;
import cn.kgc.domain.Member;
import cn.kgc.service.FindOrdersService;
import cn.kgc.service.FindVipService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/finforders")
@CrossOrigin
//查询下单
public class FindOrdersController {
    @Autowired
    FindOrdersService findOrdersService;
    @RequestMapping("/getfinforders")
    public  void getfindvip(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        // response.setCharacterEncoding("gbk");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH");
        response.setCharacterEncoding("utf-8");
        List<FindOrders> finforders = findOrdersService.findorders();
        Map<String,Object> map=new HashMap<>();
        map.put("finforders",finforders);
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