package cn.kgc.service.impl;

import cn.kgc.dao.PinglunDao;
import cn.kgc.domain.Pinglun;
import cn.kgc.service.PinglunService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/18  16:44
 */
@Service
public class PinglunServiceImpl implements PinglunService {
    @Autowired
    PinglunDao pinglunDao;
    @Override
    public List<Pinglun> findAll() {
        return pinglunDao.findAll();
    }

    @Override
    public boolean ping(Pinglun pinglun) {
        if(pinglunDao.ping(pinglun)!=0){
            return true;
        }
        return false;
    }
}
