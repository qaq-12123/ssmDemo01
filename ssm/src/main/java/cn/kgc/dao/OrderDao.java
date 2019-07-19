package cn.kgc.dao;

import cn.kgc.domain.HYData;
import cn.kgc.domain.Order;
import cn.kgc.domain.SDData;
import cn.kgc.domain.YDdata;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    /**
     * @param orderNo 訂單號
     * @return 返回一条订单*/

    @Select("select * from `order` WHERE orderNo=#{orderNo}")
    public Order findByOrderNo(String orderNo);

    /**
     * @param id
     * @return 返回一条订单*//*

    @Select("select * from `order` WHERE id=#{id}")
    public Order findByOrderId(int id);
*/
    /**
     *
     * @return 返回所有订单*/

    @Select("select * from `order`")
    public List<Order> findAllOrder();

//    /*
//    * 查询所有的车辆id*/
//    @Select("select vid from `order`")
//    public List<Integer> findAllVid();
//
//    /*
//     * 查询所有的用户id*/
//    @Select("select uid from `order`")
//    public List<Integer> findAllId();


    /**
     * 查询预定页面需要信息*/
    @Select("select orderNo, username,phone,certificate,identity,collectionTime ,rentStyle,quality ,orderStatue from (\n" +
            "select orderNo,username,phone,certificate,identity ,rentStyle,vid,collectionTime,orderStatue from `order`LEFT JOIN user on uid=user.id \n" +
            ") our left join vehicle on our.vid=vehicle.id where orderStatue not in (\"已完结\",\"驾驶中\")")
    public List<YDdata> findAllData();

    /*查询受定页面信息*/
    @Select("select * from(\n" +
            "select orderNo,userName ,phone ,email,identity,integral,pjmoney,contact,Emergency ,earnest,returnTime ,collectiontime ,vid  from \n" +
            "`order` left join user on uid =`user`.id) our LEFT JOIN vehicle on our.vid =vehicle.id where orderNo =#{orderNo}")
   public SDData findOrderNo(String orderNo);


    /**
     * @param orderNo 订单号
     * @deprecated 根据订单号删除订单
     * */
    @Update("delet from `order` where oderNo=#{order}")
    public int delByOrderNo(String orderNo);

    /**
     *@return 查询会员信息
    * */
    @Select("select g_time, c_model, b_time, rental, done, operate,vid from expensecalendar LEFT JOIN vehicle on vid=vehicle.id ")
    public  List<HYData> findHYAll();


    //查询所有账户信息
    @Select("select count(1) from `member` where mname!='' ")
    public int findCount();
}
