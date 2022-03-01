package com.string;

public class StringBuilderCapacity {
    public static void main(String[] args) {
        StringBuilder strBuilder=new StringBuilder();
        System.out.println(strBuilder.capacity());//16
        strBuilder.append("1234");
        System.out.println(strBuilder.capacity());//16
        strBuilder.append("123456789112");
        System.out.println(strBuilder.capacity());//16
        strBuilder.append("1");
        System.out.println(strBuilder.capacity()); //(oldcapacity*2)+2  //34
        StringBuilder strBuilder2=new StringBuilder("1234");
        System.out.println(strBuilder2.capacity());//
    }
}
