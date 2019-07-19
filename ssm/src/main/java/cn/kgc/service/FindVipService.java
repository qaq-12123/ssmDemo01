package cn.kgc.service;

import cn.kgc.domain.Member;

import java.util.List;

public interface FindVipService {
    //查找会员信息
    public List<Member> findvip();
    public void updatevip(Member member);
    public void deletevip(Member member);
}
