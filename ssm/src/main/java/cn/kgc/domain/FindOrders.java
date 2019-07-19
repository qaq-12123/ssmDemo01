package cn.kgc.domain;

import java.util.Date;
//查询下单

public class FindOrders {
    private String license;//车牌号
    private String owner;//客户名称
    private String orderStatue;//订单状态
    private String orderstimes;//下单日期
    private String createtime;//生成日期
    private Integer indentmoney;//订单金额

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(String orderStatue) {
        this.orderStatue = orderStatue;
    }

    public String getOrderstimes() {
        return orderstimes;
    }

    public void setOrderstimes(String orderstimes) {
        this.orderstimes = orderstimes;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getIndentmoney() {
        return indentmoney;
    }

    public void setIndentmoney(Integer indentmoney) {
        this.indentmoney = indentmoney;
    }
}
