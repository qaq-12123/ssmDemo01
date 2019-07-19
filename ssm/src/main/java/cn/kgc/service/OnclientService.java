package cn.kgc.service;

import cn.kgc.domain.Onclient;

import java.util.List;

public interface OnclientService {
    //查询在线客户
    public List<Onclient> findAll();
}
