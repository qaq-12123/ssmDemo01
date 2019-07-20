package cn.kgc.controller;

import cn.kgc.domain.Vehicle;
import cn.kgc.service.VehicleService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Administrator
 */
@Controller
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;


    /**
     * @param license 车牌号
     * @return 根据车牌查询车辆信息
	 *根据价格查询所有车辆
     * */
    @RequestMapping("/findByLicense")
    @ResponseBody
    public  Vehicle findByLisence( String license) {

        return vehicleService.findByLicense(license);
    }


    /********z张志文*********/
	//根据车型查询车辆所有
    @RequestMapping("findAllVehicle")
    @ResponseBody
    public List findAllVehicle(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAllVehicle());
        return arrayList;
    }
	//查询150以下
    @RequestMapping("findAllVehicle150")
    @ResponseBody
    public List findAllVehicle150(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAll150());
        return arrayList;
    }
	//查询150至400
    @RequestMapping("findAllVehicle400")
    @ResponseBody
    public List findAllVehicle400(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAll400());
        return arrayList;
    }
	//查询400至500之间
    @RequestMapping("findAllVehicle500")
    @ResponseBody
    public List findAllVehicle500(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAll500());
        return arrayList;
    }
	//查询500以上
    @RequestMapping("findAllVehicle600")
    @ResponseBody
    public List findAllVehicle600(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAll600());
        return arrayList;
    }
	//查询舒适型
    @RequestMapping("findAllVehicleshu")
    @ResponseBody
    public List findAllVehicleshu(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAllshu());
        return arrayList;
    }
	//经济型
    @RequestMapping("findAllVehiclejing")
    @ResponseBody
    public List findAllVehiclesuv(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAllsuv());
        return arrayList;
    }
	//中巴大巴
    @RequestMapping("findAllVehiclezhong")
    @ResponseBody
    public List findAllVehiclezhong(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAllzhong());
        return arrayList;
    }
	//suv型
    @RequestMapping("findAllVehiclesuv")
    @ResponseBody
    public List findAllVehiclejing(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(vehicleService.findAlljing());
        return arrayList;
    }

//车辆图片
    @RequestMapping("/getvehicle")
    public void vehicles(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        //查询照片数量
        int id=vehicleService.findCount();
        Map<String,Integer> map=new HashMap();
        //把结果放到map集合里
        map.put("pictures",id);
        //把json转换成字符串
        String idstring= JSON.toJSONString(map);
        PrintWriter writer = null;
        try {
            writer = httpServletResponse.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write(idstring);
        writer.flush();
        writer.close();
    }

}
