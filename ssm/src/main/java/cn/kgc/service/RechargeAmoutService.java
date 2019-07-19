package cn.kgc.service;

import cn.kgc.domain.EandV;
import cn.kgc.domain.Member;
import cn.kgc.domain.User;

import java.util.List;


public interface RechargeAmoutService {
    public List<Member> InFormation();
    public List<User> findUser();
    public List<EandV> findAVE();
}
