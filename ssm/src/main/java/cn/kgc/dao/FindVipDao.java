package cn.kgc.dao;

import cn.kgc.domain.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FindVipDao {
    @Select("select mname,phone,card,creatcliptime,endcliptime from member")
    public List<Member> findvip();
    @Update("update member set phone=#{phone} where mname=#{mname}")
    public void updatevip(Member member);
    @Delete("delete from member where card=#{card}")
    public void deletevip(Member member);

}
