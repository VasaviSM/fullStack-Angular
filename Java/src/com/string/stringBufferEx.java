package com.string;

public class stringBufferEx {
    public static void main(String[] args) {
        StringBuffer sbf =  new StringBuffer("Vasavi");
        sbf.append(" Sura");
        System.out.println(sbf);

        sbf.replace(0,6,"Vivek");
        System.out.println(sbf);

        sbf.delete(6,10);

        System.out.println(sbf);


    }
}
