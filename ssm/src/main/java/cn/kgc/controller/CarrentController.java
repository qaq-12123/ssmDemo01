package cn.kgc.controller;

import cn.kgc.domain.Costinfo;
import cn.kgc.domain.Order;
import cn.kgc.domain.Vehicle;
import cn.kgc.service.CarrentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/carrent")
@CrossOrigin
public class CarrentController {
    @Autowired
    CarrentService carrentService;

    //    查询订单表order所有数据
    @RequestMapping("/findAllOrder")
    @ResponseBody
    public List findAllOrder(){
        List<Order> orders = carrentService.findAllOrder();
        return orders;
    }

    //    查询车辆信息表vehicle所有数据
    @RequestMapping("/findAllVehicle")
    @ResponseBody
    public List findAllVehicle(){
        List<Vehicle> vehicles = carrentService.findAllVehicle();
        return vehicles;
    }

    //    查询金额表costinfo所有数据
    @RequestMapping("/findAllCostinfo")
    @ResponseBody
    public List findAllCostinfo(){
        List<Costinfo> costinfos = carrentService.findAllCostinfo();
        return costinfos;
    }
}
