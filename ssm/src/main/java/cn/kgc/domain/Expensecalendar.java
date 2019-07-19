package cn.kgc.domain;

import  java.util.Date;
public class Expensecalendar {

  private Integer id;
  private Integer pjmoney;
  private String cModel;
  private Date gTime;
  private Date bTime;
  private String rental;
  private String done;
  private String operate;
  private Integer vid;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getPjmoney() {
    return pjmoney;
  }

  public void setPjmoney(Integer pjmoney) {
    this.pjmoney = pjmoney;
  }


  public String getCModel() {
    return cModel;
  }

  public void setCModel(String cModel) {
    this.cModel = cModel;
  }


  public Date getGTime() {
    return gTime;
  }

  public void setGTime(Date gTime) {
    this.gTime = gTime;
  }


  public Date getBTime() {
    return bTime;
  }

  public void setBTime(Date bTime) {
    this.bTime = bTime;
  }


  public String getRental() {
    return rental;
  }

  public void setRental(String rental) {
    this.rental = rental;
  }


  public String getDone() {
    return done;
  }

  public void setDone(String done) {
    this.done = done;
  }


  public String getOperate() {
    return operate;
  }

  public void setOperate(String operate) {
    this.operate = operate;
  }


  public Integer getVid() {
    return vid;
  }

  public void setVid(Integer vid) {
    this.vid = vid;
  }

}
