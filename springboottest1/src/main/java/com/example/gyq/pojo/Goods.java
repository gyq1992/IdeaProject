package com.example.gyq.pojo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 57327
 * Date: 2019-07-11
 * Time: 0:38
 */
public class Goods {
    private int gid;
    private String gName;
    private String gPrice;
    private int gCount;
    private double totalPrice;
    private int rid;//角色id

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgPrice() {
        return gPrice;
    }

    public void setgPrice(String gPrice) {
        this.gPrice = gPrice;
    }

    public int getgCount() {
        return gCount;
    }

    public void setgCount(int gCount) {
        this.gCount = gCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
