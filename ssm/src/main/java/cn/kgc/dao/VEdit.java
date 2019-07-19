package cn.kgc.dao;

import cn.kgc.domain.Member;
import cn.kgc.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 *  电话更改/充值金额
 *
 *
 *  */
public interface VEdit {

    /**
     *
     * @param phone    更改会员手机号操作
     * @return
     */
    @Update("update member set phone=#{phone} where phone=#{phone}")
    public int editphone(String phone);

    /**
     *      查询单个会员
     * @param   mname
     * @param  phone
     * @return
     */
    @Select("select * member where mname=#{mmname} and phone=#{phone}")
    public int select(String mname, String phone);
    /**
     *
     * @param user   会员充值操作
     * @return
     */
    @Update("update user set balance=#{balance} where username=#{username}")
    public int balanceedit(User user);

    /**
     *
     * @param member  插入用户操作
     * @return
     */
    @Insert("insert into member values(null,#{mname},#{mgrender},#{phone},#{card}," +
            "#{email},#{creatcliptime},#{address},#{endcliptime},#{uid},#{vid},#{oid})")
    public int insertV(Member member);
    /**
     * 会员表查询全部
     * @return
     */
    @Select("select * from member")
    List<Member> findAll();

    @Select("select * from user")
    List<User> findUser();

}
