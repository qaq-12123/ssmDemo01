package cn.kgc.domain;

import java.util.Date;
public class Order {

  private Integer id;
  private String orderNo;
  private String orderStatue;
  private Date collectionTime;
  private Integer rentTime;
  private String collectionCity;
  private String colleationStore;
  private String returnStore;
  private String returnCity;
  private Date returnTime;
  private double earnest;
  private Date target;
  private Date createtime;
  private Date orderstimes;
  private Integer indentmoney;
  private Integer vid;
  private Integer uid;
  private String rentStyle;
  private String week1;
  private String week2;

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

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  private String startday;
  private String endday;
  private String img;



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public String getOrderStatue() {
    return orderStatue;
  }

  public void setOrderStatue(String orderStatue) {
    this.orderStatue = orderStatue;
  }


  public Date getCollectionTime() {
    return collectionTime;
  }

  public void setCollectionTime(Date collectionTime) {
    this.collectionTime = collectionTime;
  }


  public Integer getRentTime() {
    return rentTime;
  }

  public void setRentTime(Integer rentTime) {
    this.rentTime = rentTime;
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


  public String getReturnStore() {
    return returnStore;
  }

  public void setReturnStore(String returnStore) {
    this.returnStore = returnStore;
  }


  public String getReturnCity() {
    return returnCity;
  }

  public void setReturnCity(String returnCity) {
    this.returnCity = returnCity;
  }


  public Date getReturnTime() {
    return returnTime;
  }

  public void setReturnTime(Date returnTime) {
    this.returnTime = returnTime;
  }


  public double getEarnest() {
    return earnest;
  }

  public void setEarnest(double earnest) {
    this.earnest = earnest;
  }


  public Date getTarget() {
    return target;
  }

  public void setTarget(Date target) {
    this.target = target;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public Date getOrderstimes() {
    return orderstimes;
  }

  public void setOrderstimes(Date orderstimes) {
    this.orderstimes = orderstimes;
  }


  public Integer getIndentmoney() {
    return indentmoney;
  }

  public void setIndentmoney(Integer indentmoney) {
    this.indentmoney = indentmoney;
  }


  public Integer getVid() {
    return vid;
  }

  public void setVid(Integer vid) {
    this.vid = vid;
  }


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


  public String getRentStyle() {
    return rentStyle;
  }

  public void setRentStyle(String rentStyle) {
    this.rentStyle = rentStyle;
  }

}
