package cn.kgc.service.impl;

import cn.kgc.dao.SumFindDao;
import cn.kgc.domain.SumFind;
import cn.kgc.service.SumFindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SumFindServiceImpl implements SumFindService {
    @Autowired
    SumFindDao sumFindDao;

    @Override
    public List<SumFind> sumfind(String license) {
        return sumFindDao.sumfind(license);
    }
}
