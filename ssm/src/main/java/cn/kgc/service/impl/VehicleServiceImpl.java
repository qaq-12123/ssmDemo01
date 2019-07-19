package cn.kgc.service.impl;

import cn.kgc.dao.VehicleDao;
import cn.kgc.domain.Vehicle;
import cn.kgc.service.VehicleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

    //根据车牌号查询车辆信息
    @Override
    public Vehicle findByLicense(String license) {
        return vehicleDao.findByLicense(license);
    }

    /**
     * 查询订单里所有的车辆信息
     */
    @Override
    public List<Vehicle> findVehicle() {
        return vehicleDao.findVehicle();
    }


    @Override
    public List findAllVehicle() {
        return vehicleDao.findAllVehicle();
    }

    @Override
    public List<Vehicle> findAll150() {
        return vehicleDao.findAll150();
    }

    @Override
    public List<Vehicle> findAll400() {
        return vehicleDao.findAll400();
    }

    @Override
    public List<Vehicle> findAll500() {
        return vehicleDao.findAll500();
    }

    @Override
    public List<Vehicle> findAll600() {
        return vehicleDao.findAll600();
    }

    @Override
    public List<Vehicle> findAllshu() {
        return vehicleDao.findAllshu();
    }

    @Override
    public List<Vehicle> findAllsuv() {
        return vehicleDao.findAllsuv();
    }

    @Override
    public List<Vehicle> findAllzhong() {
        return vehicleDao.findAllzhong();
    }

    @Override
    public List<Vehicle> findAlljing() {
        return vehicleDao.findAlljing();
    }




    @Override
    public int findCount() {
        return vehicleDao.findCount();
    }
}
