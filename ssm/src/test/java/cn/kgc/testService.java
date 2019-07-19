package cn.kgc;

import cn.kgc.service.VehicleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class testService {
    @Autowired
    private VehicleService vehicleService;
    @Test
    public  void testS(){
//        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//        VehicleService vs=ac.getBean(VehicleService.class);
        System.out.println(vehicleService.findByLicense("1"));
    }
}
