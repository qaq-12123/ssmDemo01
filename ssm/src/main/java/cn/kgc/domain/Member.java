package cn.kgc.domain;

import java.util.Date;
public class Member {

  private Integer id;
  private String mname;
  private String mgrender;
  private String phone;
  private String card;
  private String email;
  private Date creatcliptime;
  private String address;
  private Date endcliptime;
  private Integer uid;
  private Integer vid;
  private Integer oid;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getMname() {
    return mname;
  }

  public void setMname(String mname) {
    this.mname = mname;
  }


  public String getMgrender() {
    return mgrender;
  }

  public void setMgrender(String mgrender) {
    this.mgrender = mgrender;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Date getCreatcliptime() {
    return creatcliptime;
  }

  public void setCreatcliptime(Date creatcliptime) {
    this.creatcliptime = creatcliptime;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Date getEndcliptime() {
    return endcliptime;
  }

  public void setEndcliptime(Date endcliptime) {
    this.endcliptime = endcliptime;
  }


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


  public Integer getVid() {
    return vid;
  }

  public void setVid(Integer vid) {
    this.vid = vid;
  }


  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }

}
