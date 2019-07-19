package cn.kgc.service.impl;

import cn.kgc.dao.RechargeAmout;

import cn.kgc.domain.EandV;
import cn.kgc.domain.Member;
import cn.kgc.domain.User;
import cn.kgc.service.RechargeAmoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RechargeAmoutServiceImpl implements RechargeAmoutService {
    @Autowired
    RechargeAmout rechargeAmout;
    @Override
    public List<Member> InFormation() {
        return rechargeAmout.InFormation();
    }
    @Override
    public List<User> findUser() {
        return rechargeAmout.findUser();
    }

    @Override
    public List<EandV> findAVE() {
        return rechargeAmout.findAVE();
    }


}
