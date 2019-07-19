package cn.kgc.service;

import cn.kgc.domain.Vehicle;

import java.util.List;


public interface VehicleService {



    /**
     * @param license  车牌号
     * @return 车辆信息
     * 根据车牌号查询车辆信息
     * */
    public Vehicle findByLicense(String license);

    /**
     *查询订单里所有的车辆信息
     *
     * */
    public List<Vehicle> findVehicle();


    /********z张志文*********/
    public List findAllVehicle();
    public List<Vehicle> findAll150();

    public List<Vehicle> findAll400();

    public List<Vehicle> findAll500();

    public List<Vehicle> findAll600();

    public List<Vehicle> findAllshu();

    public List<Vehicle> findAllsuv();

    public List<Vehicle> findAllzhong();

    public List<Vehicle> findAlljing();

    //查询所有账户信息
    public int findCount();





}
