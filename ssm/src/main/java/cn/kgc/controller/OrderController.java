package cn.kgc.controller;

import cn.kgc.domain.*;
import cn.kgc.service.*;
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
import java.util.*;

@Controller
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;


    @Autowired
    private VehicleService vehicleService;
    private HttpServletRequest request;
    private HttpServletResponse response;


    /**
     *
     * @return 所有订单的用户，车辆信息
     * */
    @RequestMapping("/findAllData")
    @ResponseBody
    public List<YDdata> findAllData(){
        List<YDdata> list=orderService.findAllData();
        for(int i=0;i<list.size();i++){
            String str="checked"+(i+1)+":false";
            list.get(i).setId(str);

        }
        return list;
    }
    /**
     * @param orderNo 订单号
     * @return 根据订单号查找订单
     * */
    @RequestMapping("/findOrderNo")
    @ResponseBody
    public SDData findByOrderNo(String orderNo){
            if(orderNo!=null){
                return orderService.findOrderNo(orderNo);
            }
      return new SDData();
    }

    /**
     * @param orderNo 订单号
     * @return 根据订单号删除订单
     * */
    @RequestMapping("/deleteByOrderNo")
    @ResponseBody
    public boolean deleteByOrderNo(String orderNo){
            if(orderNo!=null) {
                return orderService.delByOrderNo(orderNo);
            }
            return  false;
    }


    /**
     * 查询会员信息
     * */
    @RequestMapping("/findHYAll")
    @ResponseBody
    public  List<HYData> findHYAll(){
        return orderService.findHYAll();
    }


    @RequestMapping("/getorder")
    public void getCounts(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        int count = orderService.findCount();
        Map<String, Integer> counts = new HashMap<>();
        counts.put("vipcount", count);
        String str = JSON.toJSONString(counts, true);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write(str);
        writer.flush();
        writer.close();
    }


}
