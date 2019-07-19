package cn.kgc.dao;

import cn.kgc.domain.Administrator;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorDao {

    /**
     * 查询所用用户
     */
    @Select("select * from administrator ")
    public List<Administrator> findAD();


}
