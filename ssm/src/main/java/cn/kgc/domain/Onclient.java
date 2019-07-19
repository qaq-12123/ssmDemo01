package cn.kgc.domain;
/**
 *在线客户
 */
public class Onclient {
    private String username;//姓名
    private String phone;//手机号
    private String orderStatue;//订单状态
    private String license;//车牌号
    private String safety_peril;//安全隐患

    public String getSafety_peril() {
        return safety_peril;
    }

    public void setSafety_peril(String safety_peril) {
        this.safety_peril = safety_peril;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(String orderStatue) {
        this.orderStatue = orderStatue;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
