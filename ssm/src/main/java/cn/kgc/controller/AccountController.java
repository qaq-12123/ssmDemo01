package cn.kgc.controller;

import cn.kgc.domain.City;
import cn.kgc.domain.Orders;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAllCity")
    public ModelAndView findAllCity( ){
        List<City> list = accountService.findAllCity();
        String[] zimu = {"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","W","X","Y","Z"};
        List<City> A = new ArrayList<>();
        List<City> B = new ArrayList<>();
        List<City> C = new ArrayList<>();
        List<City> D = new ArrayList<>();
        List<City> E = new ArrayList<>();
        List<City> F = new ArrayList<>();
        List<City> G = new ArrayList<>();
        List<City> H = new ArrayList<>();
        List<City> J = new ArrayList<>();
        List<City> K = new ArrayList<>();
        List<City> L = new ArrayList<>();
        List<City> M = new ArrayList<>();
        List<City> N = new ArrayList<>();
        List<City> P = new ArrayList<>();
        List<City> Q = new ArrayList<>();
        List<City> R = new ArrayList<>();
        List<City> S = new ArrayList<>();
        List<City> T = new ArrayList<>();
        List<City> W = new ArrayList<>();
        List<City> X = new ArrayList<>();
        List<City> Y = new ArrayList<>();
        List<City> Z = new ArrayList<>();
        for (City city : list) {
            if (city.getWord().equals("A")) {
                A.add(city);
            }
            if (city.getWord().equals("B")) {
                B.add(city);
            }
            if (city.getWord().equals("C")) {
                C.add(city);
            }
            if (city.getWord().equals("D")) {
                D.add(city);
            }
            if (city.getWord().equals("E")) {
                E.add(city);
            }
            if (city.getWord().equals("F")) {
                F.add(city);
            }
            if (city.getWord().equals("G")) {
                G.add(city);
            }
            if (city.getWord().equals("H")) {
                H.add(city);
            }
            if (city.getWord().equals("J")) {
                J.add(city);
            }
            if (city.getWord().equals("K")) {
                K.add(city);
            }
            if (city.getWord().equals("L")) {
                L.add(city);
            }
            if (city.getWord().equals("M")) {
                M.add(city);
            }
            if (city.getWord().equals("N")) {
                N.add(city);
            }
            if (city.getWord().equals("P")) {
                P.add(city);
            }
            if (city.getWord().equals("Q")) {
                Q.add(city);
            }
            if (city.getWord().equals("R")) {
                R.add(city);
            }
            if (city.getWord().equals("S")) {
                S.add(city);
            }
            if (city.getWord().equals("T")) {
                T.add(city);
            }
            if (city.getWord().equals("W")) {
                W.add(city);
            }
            if (city.getWord().equals("X")) {
                X.add(city);
            }
            if (city.getWord().equals("Y")) {
                Y.add(city);
            }
            if (city.getWord().equals("Z")) {
                Z.add(city);
            }

        }
        Map<String,List<City>> map = new HashMap();
        map.put("A",A);
        map.put("B",B);
        map.put("C",C);
        map.put("D",D);
        map.put("E",E);
        map.put("F",F);
        map.put("G",G);
        map.put("H",H);
        map.put("J",J);
        map.put("K",K);
        map.put("L",L);
        map.put("M",M);
        map.put("N",N);
        map.put("P",P);
        map.put("Q",Q);
        map.put("R",R);
        map.put("S",S);
        map.put("T",T);
        map.put("W",W);
        map.put("X",X);
        map.put("Y",Y);
        map.put("Z",Z);
        ModelAndView nv = new ModelAndView(new MappingJackson2JsonView());
        nv.addObject("map",map);
        nv.setViewName("list");
        return nv;
    }

    @RequestMapping("/findAllCityMap")
    public @ResponseBody Map<String,List<String>> findAllCityMap( ) {
        List<City> list = accountService.findAllCity();
        String[] zimu = {"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","W","X","Y","Z"};
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        List<String> C = new ArrayList<>();
        List<String> D = new ArrayList<>();
        List<String> E = new ArrayList<>();
        List<String> F = new ArrayList<>();
        List<String> G = new ArrayList<>();
        List<String> H = new ArrayList<>();
        List<String> J = new ArrayList<>();
        List<String> K = new ArrayList<>();
        List<String> L = new ArrayList<>();
        List<String> M = new ArrayList<>();
        List<String> N = new ArrayList<>();
        List<String> P = new ArrayList<>();
        List<String> Q = new ArrayList<>();
        List<String> R = new ArrayList<>();
        List<String> S = new ArrayList<>();
        List<String> T = new ArrayList<>();
        List<String> W = new ArrayList<>();
        List<String> X = new ArrayList<>();
        List<String> Y = new ArrayList<>();
        List<String> Z = new ArrayList<>();
        for (City city : list) {
            if (city.getWord().equals("A")) {
                A.add(city.getCityname());
                A.add(city.getAbb());
            }
            if (city.getWord().equals("B")) {
                B.add(city.getCityname());
                B.add(city.getAbb());
            }
            if (city.getWord().equals("C")) {
                C.add(city.getCityname());
                C.add(city.getAbb());
            }
            if (city.getWord().equals("D")) {
                D.add(city.getCityname());
                D.add(city.getAbb());
            }
            if (city.getWord().equals("E")) {
                E.add(city.getCityname());
                E.add(city.getAbb());
            }
            if (city.getWord().equals("F")) {
                F.add(city.getCityname());
                F.add(city.getAbb());
            }
            if (city.getWord().equals("G")) {
                G.add(city.getCityname());
                G.add(city.getAbb());
            }
            if (city.getWord().equals("H")) {
                H.add(city.getCityname());
                H.add(city.getAbb());
            }
            if (city.getWord().equals("J")) {
                J.add(city.getCityname());
                J.add(city.getAbb());
            }
            if (city.getWord().equals("K")) {
                K.add(city.getCityname());
                K.add(city.getAbb());
            }
            if (city.getWord().equals("L")) {
                L.add(city.getCityname());
                L.add(city.getAbb());
            }
            if (city.getWord().equals("M")) {
                M.add(city.getCityname());
                M.add(city.getAbb());
            }
            if (city.getWord().equals("N")) {
                N.add(city.getCityname());
                N.add(city.getAbb());
            }
            if (city.getWord().equals("P")) {
                P.add(city.getCityname());
                P.add(city.getAbb());
            }
            if (city.getWord().equals("Q")) {
                Q.add(city.getCityname());
                Q.add(city.getAbb());
            }
            if (city.getWord().equals("R")) {
                R.add(city.getCityname());
                R.add(city.getAbb());
            }
            if (city.getWord().equals("S")) {
                S.add(city.getCityname());
                S.add(city.getAbb());
            }
            if (city.getWord().equals("T")) {
                T.add(city.getCityname());
                T.add(city.getAbb());
            }
            if (city.getWord().equals("W")) {
                W.add(city.getCityname());
                W.add(city.getAbb());
            }
            if (city.getWord().equals("X")) {
                X.add(city.getCityname());
                X.add(city.getAbb());
            }
            if (city.getWord().equals("Y")) {
                Y.add(city.getCityname());
                Y.add(city.getAbb());
            }
            if (city.getWord().equals("Z")) {
                Z.add(city.getCityname());
                Z.add(city.getAbb());
            }

        }
        Map<String,List<String>> map = new HashMap();
        map.put("A",A);
        map.put("B",B);
        map.put("C",C);
        map.put("D",D);
        map.put("E",E);
        map.put("F",F);
        map.put("G",G);
        map.put("H",H);
        map.put("J",J);
        map.put("K",K);
        map.put("L",L);
        map.put("M",M);
        map.put("N",N);
        map.put("P",P);
        map.put("Q",Q);
        map.put("R",R);
        map.put("S",S);
        map.put("T",T);
        map.put("W",W);
        map.put("X",X);
        map.put("Y",Y);
        map.put("Z",Z);
        ModelAndView mv = new ModelAndView();
        mv.addObject("map",map);
        return map;
    }

    @RequestMapping("/findOrder")
    public @ResponseBody
   ModelAndView findOrder( ){
        List<Orders> list = accountService.findAllOrders();
        for (Orders orders : list) {
            Date time1 = orders.getCollectionTime();
            Date time2 = orders.getReturnTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            String format1 = sdf.format(time1);
            String format2 = sdf.format(time2);
            String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = sdf.parse(format1);
                date2 = sdf.parse(format2);
                cal1.setTime(date1);
                cal2.setTime(date2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int w1 = cal1.get(Calendar.DAY_OF_WEEK) - 1;
            int w2 = cal2.get(Calendar.DAY_OF_WEEK) - 1;
            orders.setWeek1(weekDays[w1]);
            orders.setWeek2(weekDays[w2]);
            orders.setStartday(format1) ;
            orders.setEndday(format2) ;
        }
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        mv.addObject("list",list);
        mv.setViewName("list");
        return mv;
    }

    @RequestMapping("/findOrderList")
    public @ResponseBody
    List<Orders> findOrderList(){
        List<Orders> list = accountService.findAllOrders();
        for (Orders orders : list) {
            Date time1 = orders.getCollectionTime();
            Date time2 = orders.getReturnTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            String format1 = sdf.format(time1);
            String format2 = sdf.format(time2);
            String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = sdf.parse(format1);
                date2 = sdf.parse(format2);
                cal1.setTime(date1);
                cal2.setTime(date2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int w1 = cal1.get(Calendar.DAY_OF_WEEK) - 1;
            int w2 = cal2.get(Calendar.DAY_OF_WEEK) - 1;
            orders.setWeek1(weekDays[w1]);
            orders.setWeek2(weekDays[w2]);
            orders.setStartday(format1) ;
            orders.setEndday(format2) ;
        }
        return list;
    }
}
