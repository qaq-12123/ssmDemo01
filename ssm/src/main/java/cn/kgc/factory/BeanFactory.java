//package cn.kgc.factory;
//
//import cn.kgc.service.AccountService;
//import cn.kgc.utils.TransactionManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//
///**
// * 用于创建Service的代理对象的工厂
// */
//@Controller
//public class BeanFactory {
//    @Autowired
//    private AccountService accountService;
//    @Autowired
//    private TransactionManager txManager;
//
//    /**
//     * 获取service的代理对象
//     * @return
//     */
//    public AccountService getAccountService(){
//            return (AccountService)Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Object o = null;
//                try {
//                    //开启事务
//                    txManager.beginTransaction();
//                    //执行操作
//                    o = method.invoke(accountService, args);
//                    //提交事务
//                    txManager.commit();
//                    //返回结果
//                    return o;
//                } catch (Exception e) {
//                    //执行回滚
//                    txManager.rollback();
//                    throw new RuntimeException(e);
//                } finally {
//                    //释放资源
//                    txManager.relese();
//                }
//            }
//        });
//    }
//}
