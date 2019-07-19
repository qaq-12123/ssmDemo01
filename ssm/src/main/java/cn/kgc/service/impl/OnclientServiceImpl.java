package cn.kgc.service.impl;

import cn.kgc.dao.OnclientDao;
import cn.kgc.domain.Onclient;
import cn.kgc.service.OnclientService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OnclientServiceImpl implements OnclientService {
    @Autowired
    OnclientDao onclientDao;
    @Override
    public List<Onclient> findAll() {
        return onclientDao.findAll();
    }
}
