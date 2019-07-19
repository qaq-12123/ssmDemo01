package cn.kgc.controller;

import cn.kgc.domain.Accountes;
import cn.kgc.service.NewOrderService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//查询最新订单查询
@Controller
    @RequestMapping("/neworder")
@CrossOrigin
public class NewOrderController {
    @Autowired
    NewOrderService newOrderService;
    @RequestMapping("/getneworder")
    public  void getneworder(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setCharacterEncoding("utf-8");
        // response.setCharacterEncoding("gbk");
        List<Accountes> findneworder = newOrderService.findneworder();
        Map<String,Object> map=new HashMap<>();
        map.put("getneworder",findneworder);
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
    //     // return  findneworder;
    }
}