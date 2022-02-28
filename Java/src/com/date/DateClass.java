package com.date;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Date d1,d2,d3,d4,d5,d6;
        d1 = new Date(2022,1,20);
        d2 = new Date(2022,2,21);
        d3 = new Date(2022,3,20);
        d4 = new Date(2022,3,20);
        d5 = new Date(2021,1,1);
        d6 = new Date(2022,12,31);

        System.out.println("The result for before method: "+d1.before(d2));
        System.out.println("The result for equals method: "+d3.equals(d4));
        System.out.println("The result for after method: "+d5.after(d6));
        System.out.println("Using compaareTo method: "+d2.compareTo(d1));
        System.out.println("Using compaareTo method: "+d4.compareTo(d3));
        System.out.println("Using compaareTo method: "+d5.compareTo(d6));
        System.out.println("Using get method");
        System.out.println("The time passed since "+d5+" is "+d5.getTime());


    }
}
