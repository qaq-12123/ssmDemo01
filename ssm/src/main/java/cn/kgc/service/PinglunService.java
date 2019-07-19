package cn.kgc.service;

import cn.kgc.domain.Pinglun;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/18  16:44
 */
public interface PinglunService {
    public List<Pinglun> findAll();
    public boolean ping(Pinglun pinglun);
}
