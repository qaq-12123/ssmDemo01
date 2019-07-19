package cn.kgc.dao;

import cn.kgc.domain.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 会员管理
 */
public interface RechargeAmout {
    /**
     * 保存一个普通账户
     * @param member  会员基本信息
     * @param account   账户信息
     * @param expenseCalendar    消费记录
     */
   // public String LookVipNews(Member member, Account account, ExpenseCalendar expenseCalendar);
    /**
     * 基本信息
     * 备用sql  where mname=#{mname},phone=#{phone},email=#{email},card=#{card}
     */
    @Select("select mname,phone,email,card from member")
    public List<Member> InFormation();
    /**
     *
     *     账户信息
     * @return      integral    pjmoney
     * 备用sql where integral=#{integral},pjmoney=#{pjmoney}
     */
    @Select("select * from user")
    public List<User> findUser();

    /**
     *
     *     消费记录
     * @return
     * 备用sql   where g_time=#{g_time},c_model=#{c_model},rental#{rental},done=#{done},operate=#{operate}
     */
    @Select("select g_time, c_model, b_time, rental, done, operate,vid from expensecalendar LEFT JOIN vehicle on vid=vehicle.id;")
    public List<EandV> findAVE();

}
