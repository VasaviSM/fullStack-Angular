package com.string;

public class StringAndStringBuffer {
    public static void main(String[] args){
        /*
        String sname1 = "vaishali";
        System.out.println(sname1);
        String sname = "rohan";
        System.out.println(sname);

        //strind is immutable -  cant be changed
        String s1 = new String("M");
        System.out.println(s1);
        String s2 = new String("s");
        System.out.println(s2);
        s1=s2;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1+s2);
*/
        // StringBuffer sb2 =  new StringBuffer("hello");  //StringBuffer is mutable
        // sb2.append("vaishali");
        // System.out.println(sb2);

       /* StringBuffer sb2 =  new StringBuffer();
        System.out.println(sb2.capacity());  //default capacity is 16
        sb2.insert(0,"Data");
        System.out.println(sb2);
        sb2.insert(2,"formationdfdfdfdf");
        System.out.println(sb2);
        sb2.insert(10,"mystring");
        System.out.println(sb2);
        */
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.insert(0, "Data");
        System.out.println(sb2);
        sb2.insert(10, "formation");
        System.out.println(sb2.append("This is a book"));
        int n = sb2.indexOf("is");
        int n1 = sb2.lastIndexOf("book");
        System.out.println(n);
        System.out.println(n1);

    }
}