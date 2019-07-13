//package cn.kgc.utils;
//
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
///**
// * 连接工具类
// */
//public class ConnectionUtils {
//    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
//
//
//    private DataSource dataSource;
//
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    /**
//     * 获取当前线程上的连接
//     * @return
//     */
//    public Connection getThreadConnetcion(){
//        try {
//            //先从threadlocal上获取
//            Connection conn = tl.get();
//            //判断线程上是否有连接
//            if(conn==null){
//                //如果conn为空，从数据源中获取一个连接，并存入线程中
//                conn = dataSource.getConnection();
//                tl.set(conn);
//                //返回线程上的连接
//            }
//            return conn;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * 把链接和线程解绑
//     */
//    public void remonveConnection(){
//        tl.remove();
//    }
//}
