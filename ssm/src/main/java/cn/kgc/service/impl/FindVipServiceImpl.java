package cn.kgc.service.impl;

import cn.kgc.dao.FindVipDao;
import cn.kgc.domain.Member;
import cn.kgc.service.FindVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindVipServiceImpl implements FindVipService {
    @Autowired
    FindVipDao findVipDao;
    @Override
    public List<Member> findvip() {
        return findVipDao.findvip();
    }

    @Override
    public void updatevip(Member member) {
        findVipDao.updatevip(member);
    }

    @Override
    public void deletevip(Member member) {
        findVipDao.deletevip(member);
    }
}
