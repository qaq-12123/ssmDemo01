package cn.kgc.dao;

import cn.kgc.domain.Vehicle;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleDao {

    /**
    * @param license  车牌号
    * @return 车辆信息
    * 根据车牌号查询车辆信息
    * */
    @Select("select * from vehicle where license=#{license}")
    public Vehicle findByLicense(String license);


    /**
     *查询订单里所有的车辆信息
     *
     * */
    @Select("select *  from vehicle where id in(select vid from `order`)")
    public List<Vehicle> findVehicle();


    //查询所有
    @Select("select * from vehicle")
    public List<Vehicle> findAllVehicle();
    //查询150以下
    @Select("select * from vehicle where rentMoney<150")
    public List<Vehicle> findAll150();
    //查询150-400之间
    @Select("select * from vehicle where rentMoney>=150 and rentMoney<400")
    public List<Vehicle> findAll400();
    //查询400-500之间
    @Select("select * from vehicle where rentMoney>=400 and rentMoney<500")
    public List<Vehicle> findAll500();
    //查询500以上
    @Select("select * from vehicle where rentMoney>=500")
    public List<Vehicle> findAll600();
    //查询舒适型
    @Select("select * from vehicle where quality='舒适型'")
    public List<Vehicle> findAllshu();
    //查询经济型
    @Select("select * from vehicle where quality='经济型'")
    public List<Vehicle> findAllsuv();
    //查询中巴大巴
    @Select("select * from vehicle where quality='中巴/大巴'")
    public List<Vehicle> findAllzhong();
    //查询suv
    @Select("select * from vehicle where quality='SUV'")
    public List<Vehicle> findAlljing();


    //查询照片总数
    @Select("select count(1) from `vehicle` where img!=''")
    public int findCount();
}
