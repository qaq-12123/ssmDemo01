package cn.kgc.service;

import cn.kgc.domain.HYData;
import cn.kgc.domain.Order;

import cn.kgc.domain.SDData;
import cn.kgc.domain.YDdata;

import java.util.List;

public interface OrderService {

    /**
     * @param orderNo 訂單號
     * @return 返回一条订单*/

    public Order findByOrderNo(String orderNo);

//    /**
//     * @param id
//     * @return 返回一条订单*/
//    public Order findByOrderId();

        /**
        *@return 返回一条订单
         * */
    public List<Order> findAllOrder();


    /**
     * 查询预定页面需要信息*/
    public List<YDdata> findAllData();


    /*查询受定页面信息*/
    public SDData findOrderNo(String orderNo);

    /**
     * @param orderNo 订单号
     * @deprecated 根据订单号删除订单
     * */
    public boolean delByOrderNo(String orderNo);


    /**
     * @return 查询会员信息
     * */
    public List<HYData> findHYAll();


    //统计订单总数
    public int findCount();
}
