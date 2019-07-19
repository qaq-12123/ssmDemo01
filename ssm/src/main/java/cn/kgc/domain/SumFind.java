package cn.kgc.domain;

import java.util.Date;
//加的表
public class SumFind {
    private String owner;//客户名称
    private String license;//车牌号
    private String phone;//手机号
    private String identity;//身份证号
    private String createtime;//生成日期
    private String orderstimes;//下单日期
    private Integer indentmoney;//订单金额
    private String orderStatue;//订单状态
    private String returnStore;//还车门店
    private String colleationStore;//取车门店

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getOrderstimes() {
        return orderstimes;
    }

    public void setOrderstimes(String orderstimes) {
        this.orderstimes = orderstimes;
    }

    public Integer getIndentmoney() {
        return indentmoney;
    }

    public void setIndentmoney(Integer indentmoney) {
        this.indentmoney = indentmoney;
    }

    public String getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(String orderStatue) {
        this.orderStatue = orderStatue;
    }

    public String getReturnStore() {
        return returnStore;
    }

    public void setReturnStore(String returnStore) {
        this.returnStore = returnStore;
    }

    public String getColleationStore() {
        return colleationStore;
    }

    public void setColleationStore(String colleationStore) {
        this.colleationStore = colleationStore;
    }
}
