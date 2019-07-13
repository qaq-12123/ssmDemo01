//package cn.kgc.utils;
//
//import cn.kgc.utils.ConnectionUtils;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.junit.After;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//
//import java.sql.SQLException;
//
///**
// * 事务管理工具类：
// *      开启事务
// *      提交事务
// *      回滚事务
// *      释放连接
// */
//public class TransactionManager {
//
//    private ConnectionUtils connectionUtils;
//
//    public void setConnectionUtils(ConnectionUtils connectionUtils) {
//        this.connectionUtils = connectionUtils;
//    }
//    public void pti(){}
//    /**
//     * 开启事务
//     */
//    public void beginTransaction(){
//        try {
//            connectionUtils.getThreadConnetcion().setAutoCommit(false);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    /**
//     * 提交事务
//     */
//    public void commit(){
//        try {
//            connectionUtils.getThreadConnetcion().commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    /**
//     * 回滚事务
//     */
//    public void rollback(){
//        try {
//            connectionUtils.getThreadConnetcion().rollback();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    /**
//     * 释放连接
//     */
//    public void relese(){
//        try {
//            connectionUtils.getThreadConnetcion().close();//还回连接池中
//            connectionUtils.remonveConnection();//解绑
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public Object aroundAdvice(ProceedingJoinPoint point){
//        Object o = null;
//        try {
//            //获取参数
//            Object[] args = point.getArgs();
//            //开启事务
//            this.beginTransaction();
//            //执行操作
//            o = point.proceed(args);
//            //提交事务
//            this.commit();
//            //返回结果
//            return o;
//        }catch (Throwable e){
//            this.rollback();
//            throw new RuntimeException(e);
//        }finally {
//            this.relese();
//        }
//    }
//}
