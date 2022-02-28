package com.string;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.insert(0, "Data");
        System.out.println(sb2);
        sb2.insert(10, "formationdfdfdfdfdf");
        System.out.println(sb2);

    }
}
