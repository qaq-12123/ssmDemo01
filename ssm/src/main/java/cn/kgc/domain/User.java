package cn.kgc.domain;

/**
 * 用户类
 */
public class User {
    private String username;
    private String usergrender;
    private Integer age;
    private Integer identity;
    private String address;
    private String handimg;
    private String contact;
    private String Emergency;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", usergrender='" + usergrender + '\'' +
                ", age=" + age +
                ", identity=" + identity +
                ", address='" + address + '\'' +
                ", handimg='" + handimg + '\'' +
                ", contact='" + contact + '\'' +
                ", Emergency='" + Emergency + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsergrender() {
        return usergrender;
    }

    public void setUsergrender(String usergrender) {
        this.usergrender = usergrender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHandimg() {
        return handimg;
    }

    public void setHandimg(String handimg) {
        this.handimg = handimg;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmergency() {
        return Emergency;
    }

    public void setEmergency(String emergency) {
        Emergency = emergency;
    }
}
