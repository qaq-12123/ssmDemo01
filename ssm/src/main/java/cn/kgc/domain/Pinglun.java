package cn.kgc.domain;

import java.util.Date;
public class Pinglun {

  private Integer id;
  private String head;
  private String name;
  private Date time;
  private Integer fen;
  private String content;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }


  public Integer getFen() {
    return fen;
  }

  public void setFen(Integer fen) {
    this.fen = fen;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
