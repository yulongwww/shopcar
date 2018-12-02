package org.lanqiao;

public class Product {
    private String pname;
    private double pmoney;
    private int pnum;

    public Product() {
    }

    public Product(double pmoney, int pnum) {
        this.pmoney = pmoney;
        this.pnum = pnum;
    }

    public Product(String pname, double pmoney, int pnum) {
        this.pname = pname;
        this.pmoney = pmoney;
        this.pnum = pnum;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPmoney() {
        return pmoney;
    }

    public void setPmoney(double pmoney) {
        this.pmoney = pmoney;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    @Override
    public String toString() {
        return "product{" +
                "pname='" + pname + '\'' +
                ", pmoney=" + pmoney +
                ", pnum=" + pnum +
                '}';
    }
}
