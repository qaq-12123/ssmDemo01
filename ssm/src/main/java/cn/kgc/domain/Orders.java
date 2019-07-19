package cn.kgc.domain;

import java.util.Date;

/**
 * 订单实体类
 */
public class Orders {
    private Integer id;
    private String orderNo;
    private Date collectionTime;
    private Date returnTime;
    private Integer rentTime;
    private String returnStore;
    private String collectionCity;
    private String colleationStore;
    private String returnCity;
    private String brand;
    private String week1;
    private String week2;
    private String startday;
    private String endday;
    private String img;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNo=" + orderNo +
                ", collectionTime=" + collectionTime +
                ", carTime=" + returnTime +
                ", rentTime=" + rentTime +
                ", returnStore='" + returnStore + '\'' +
                ", collectionCity='" + collectionCity + '\'' +
                ", colleationStore='" + colleationStore + '\'' +
                ", returnCity='" + returnCity + '\'' +
                ", brand='" + brand + '\'' +
                ", week1='" + week1 + '\'' +
                ", week2='" + week2 + '\'' +
                ", startday='" + startday + '\'' +
                ", endday='" + endday + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
    }

    public String getReturnStore() {
        return returnStore;
    }

    public void setReturnStore(String returnStore) {
        this.returnStore = returnStore;
    }

    public String getCollectionCity() {
        return collectionCity;
    }

    public void setCollectionCity(String collectionCity) {
        this.collectionCity = collectionCity;
    }

    public String getColleationStore() {
        return colleationStore;
    }

    public void setColleationStore(String colleationStore) {
        this.colleationStore = colleationStore;
    }

    public String getReturnCity() {
        return returnCity;
    }

    public void setReturnCity(String returnCity) {
        this.returnCity = returnCity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeek1() {
        return week1;
    }

    public void setWeek1(String week1) {
        this.week1 = week1;
    }

    public String getWeek2() {
        return week2;
    }

    public void setWeek2(String week2) {
        this.week2 = week2;
    }

    public String getStartday() {
        return startday;
    }

    public void setStartday(String startday) {
        this.startday = startday;
    }

    public String getEndday() {
        return endday;
    }

    public void setEndday(String endday) {
        this.endday = endday;
    }
}
