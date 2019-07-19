package cn.kgc.domain;

import java.util.Date;

/**
 * 车辆表实体类
 */
public class vehicle {
    private Integer id;
    private String license;
    private String engine;
    private Integer limitNum;
    private Date registration;
    private Date issue;
    private String owner;
    private String cartype;
    private String brand;
    private String img;

    @Override
    public String toString() {
        return "vehicle{" +
                "id=" + id +
                ", license='" + license + '\'' +
                ", engine='" + engine + '\'' +
                ", limitNum=" + limitNum +
                ", registration=" + registration +
                ", issue=" + issue +
                ", owner='" + owner + '\'' +
                ", cartype='" + cartype + '\'' +
                ", brand='" + brand + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public Date getIssue() {
        return issue;
    }

    public void setIssue(Date issue) {
        this.issue = issue;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
