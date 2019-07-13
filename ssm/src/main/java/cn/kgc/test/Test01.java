package cn.kgc.test;


import cn.kgc.dao.AccountDao;
import cn.kgc.domain.Account;
import cn.kgc.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    @Test
    public  void run1() throws IOException {
        Account account = new Account();
        account.setName("王五");
        account.setMoney(100);
//        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        List<Account> all = accountService.findAll();
//        for (Account account : all) {
//            System.out.println(account);
//        }
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<Account> all = mapper.findAll();
//        for (Account account : all) {
//            System.out.println(account);
//        }
        int i = mapper.saveAccount(account);
        System.out.println("影响行数:"+i);
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
}
