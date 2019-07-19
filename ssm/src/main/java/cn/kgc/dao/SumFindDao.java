package cn.kgc.dao;

import cn.kgc.domain.SumFind;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//ok
public interface SumFindDao {
    @Select("select phone,identity,indentmoney,a.*\n" +
            " from (\n" +
            "select license,createtime,indentmoney,orderstimes ,colleationStore ,returnStore ,orderStatue,`owner` ,uid from \n" +
            "`vehicle` LEFT JOIN `order` on vid=vehicle.id where license=#{license}) as a \n" +
            "left join `user` on `user`.id=uid")
    public List<SumFind> sumfind(String license);
}
