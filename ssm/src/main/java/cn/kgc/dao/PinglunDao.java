package cn.kgc.dao;

import cn.kgc.domain.Pinglun;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/18  16:42
 */
public interface PinglunDao {

    @Select("select * from pinglun")
    public List<Pinglun> findAll();

    @Insert("insert into pinglun values(null,#{head},#{name},#{time},#{fen},#{content})")
    public int ping(Pinglun pinglun);

}
