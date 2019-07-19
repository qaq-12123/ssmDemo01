package cn.kgc.controller;

import cn.kgc.domain.Administrator;
import cn.kgc.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/admin")
@CrossOrigin
public class AdministratorServiceController {
    HttpServletResponse response;

    @Autowired
    private AdministratorService as;


    /**
     * @return 返回所有会员信息
     * */
    @RequestMapping("/findAdmin")
    @ResponseBody
    public List<Administrator> findAdmin( ){

        return  as.findAD() ;

    }

}
