package cn.kgc.controller;

import cn.kgc.domain.Member;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//会员修改删除查询
@Controller
@RequestMapping("/findvip")
@CrossOrigin
public class FindVipController {
    @Autowired
    FindVipService findVipService;
    @RequestMapping("/getfindvip")
    public  void getfindvip(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setCharacterEncoding("utf-8");
        // response.setCharacterEncoding("gbk");
        List<Member> findvip = findVipService.findvip();
        Map<String,Object> map=new HashMap<>();
        map.put("findvip",findvip);
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
    @RequestMapping("/updatevip")
    public String updatevip(String mname,String phone){
        Member member=new Member();
        member.setMname(mname);
        member.setPhone(phone);
        findVipService.updatevip(member);
        return "/findvip/getfindvip";
    }
    @RequestMapping("/deletevip")
    public String deletevip(String card){
        Member member=new Member();
        member.setCard(card);
        findVipService.deletevip(member);
        return "/findvip/getfindvip";
    }
}