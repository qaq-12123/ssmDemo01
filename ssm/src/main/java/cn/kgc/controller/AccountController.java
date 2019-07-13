package cn.kgc.controller;

import cn.kgc.domain.Account;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/delAccount")
    public String delAccount(@RequestParam(name = "name")String name){
        int i = accountService.delAccount(name);
        String result = i!=0?"删除成功！":"删除失败！";
        System.out.println(result);
        return "list";
    }
    @RequestMapping("/updateAccount")
    public String updateAccount(@RequestParam(name = "moeny")double moeny,@RequestParam(name = "name")String name){
        Account account = new Account();
        account.setName(name);
        account.setMoney(moeny);
        int i = accountService.updateAccount(account);
        String result = i!=0?"修改成功！":"修改失败！";
        System.out.println(result);
        return "list";
    }
    @RequestMapping("/saveAccount")
    public ModelAndView saveAccount(Account account )   {
        int i = accountService.saveAccount(account);
        String result = i!=0?"保存成功！":"保存失败！";
        System.out.println(result);
        List<Account> list = new ArrayList();
        list.add(account);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("list");
        return modelAndView;
    }
    @RequestMapping("/testUpload")
    public String testUpload(MultipartFile upload,HttpServletRequest request) throws IOException {
        System.out.println("文件开始上传.....");
        String path = request.getSession().getServletContext().getRealPath("/upload");
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;
        upload.transferTo(new File(path,filename));
        System.out.println("文件上传结束.....");
        return "list";
    }
    @Transactional(readOnly = false)
    @RequestMapping("/testTransfer")
    public String testTransfer(String newName,String oldName ,double money){
        int count=0;
        try {
            count = accountService.transfer(newName, oldName, money);
            System.out.println("转账成功,影响行数"+count);
            return "testTransfer";
        } catch (Exception e) {
            System.out.println("转账失败,影响行数"+count);
            return "error";
        }
    }
    @Transactional(readOnly = false)
    @RequestMapping("/testRecharge")
    public String testRecharge(String name,double money){
        int count=0;
        try {
            Account account = accountService.findAllByName(name);
            account.setMoney(account.getMoney()+money);
            count = accountService.updateAccount(account);
            System.out.println("充值成功！,影响行数"+count);
            return "testTransfer";
        } catch (Exception e) {
            System.out.println("充值失败！,影响行数"+count);
            e.printStackTrace();
            return "error";
        }
    }
//    @RequestMapping("/saveAccount")
//    public void saveAccount(Account account, HttpServletRequest request , HttpServletResponse response) throws IOException {
//        int i = accountService.saveAccount(account);
//        String result = i!=0?"保存成功！":"保存失败！";
//        request.setAttribute("result",result);
//        response.sendRedirect(request.getContextPath()+"/account/findAll");
//    }
//    @RequestMapping("/saveAccount")
//    public String saveAccount(@ModelAttribute("account") Account account,Model model){
//        int i = accountService.saveAccount(account);
//        String result = i!=0?"保存成功！":"保存失败！";
//        model.addAttribute("result",result);
//        return "list";
//    }
//    @ModelAttribute
//    public void account(String name,double money, Map<String,Account>map){
//        Account account = new Account();
//        account.setName(name);
//        account.setMoney(money);
//        map.put("account",account);
//    }
}
