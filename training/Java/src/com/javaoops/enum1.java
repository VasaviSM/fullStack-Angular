package com.javaoops;

enum Month {

    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April");
    String name;

    Month(String value) {
        this.name = value;
    }
}
public class enum1 {
    public static void main(String[] args) {
        Month month = Month.APR;
        for(Month m : month.values()){
            System.out.println(m.name);
        }
    }
}

