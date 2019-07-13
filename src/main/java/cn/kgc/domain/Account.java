package cn.kgc.domain;

import java.io.Serializable;

/**
 * 账户信息实体类
 */
public class Account implements Serializable {
    private int id;
    private String name;
    private double money;

    public Account(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Account() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
