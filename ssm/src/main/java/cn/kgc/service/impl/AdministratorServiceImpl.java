package cn.kgc.service.impl;

import cn.kgc.dao.AdministratorDao;
import cn.kgc.domain.Administrator;
import cn.kgc.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorDao administratorDao;
    @Override
    public List<Administrator> findAD() {

        return administratorDao.findAD();
    }
}
