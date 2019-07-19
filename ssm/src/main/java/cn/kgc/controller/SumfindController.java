package cn.kgc.controller;

import cn.kgc.domain.FindOrders;
import cn.kgc.domain.SumFind;
import cn.kgc.service.FindOrdersService;
import cn.kgc.service.SumFindService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//附加表
@Controller
@RequestMapping("/sumfind")
@CrossOrigin
public class SumfindController {
    @Autowired
    SumFindService sumFindService;
    @RequestMapping("/getsumfind")
    public  void getsumfind(HttpServletRequest request, HttpServletResponse response,String license) throws UnsupportedEncodingException {
        response.setCharacterEncoding("utf-8");
        // response.setCharacterEncoding("gbk");
        List<SumFind> sumfind = sumFindService.sumfind(license);
        Map<String,List> map=new HashMap<>();
        map.put("sumfind",sumfind);
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
