package com.pack.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Course {
    public Course(){}
    @Id
    @Column(name="cid")

    private int cid;
    @Column(name="cname")

    private String cname;
    @Column(name="price")
    private double price;

    public int getCid() {return cid;}

    public void setCid(int cid) {this.cid = cid;}

    public String getCname() {return cname;}

    public void setCname(String cname) {this.cname = cname;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

}
