package cn.kgc.service.impl;

import cn.kgc.dao.OrderDao;
import cn.kgc.domain.HYData;
import cn.kgc.domain.Order;
import cn.kgc.domain.SDData;
import cn.kgc.domain.YDdata;
import cn.kgc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    /**
     * @param orderNo 訂單號
     * @return 返回一条订单
     */
    @Override
    public Order findByOrderNo(String orderNo) {
        return orderDao.findByOrderNo(orderNo);
    }

//    /**
//     * @param id
//     * @return 返回一条订单
//     */
//    @Override
//    public Order findByOrderId() {
//        return orderDao.findByOrderId(;
//    }



    /**
     *返回所有的订单
     * */
    @Override
    public List<Order> findAllOrder() {
        return orderDao.findAllOrder();
    }

    @Override
    public List<YDdata> findAllData() {
        return orderDao.findAllData();
    }

    @Override
    public SDData findOrderNo(String orderNo) {
        return orderDao.findOrderNo(orderNo);
    }

    @Override
    public boolean delByOrderNo(String orderNo) {
        if(orderDao.delByOrderNo(orderNo)==0){
            return false;
        }
        return true;
    }

    /**
     * @return 查询会员信息
     */
    @Override
    public List<HYData> findHYAll() {
        return orderDao.findHYAll();
    }


    @Override
    public int findCount() {
        return orderDao.findCount();
    }

}
