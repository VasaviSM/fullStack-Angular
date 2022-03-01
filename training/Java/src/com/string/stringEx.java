package com.string;

import java.util.Locale;

public class stringEx {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1+" "+str2);
        System.out.println("str1 hashcode: "+str1.hashCode()+" String2 hashcode: "+str2.hashCode());
        //string literals are created in string pool (string pool is inside heap)...
        // when two literals are given same values, both will point to one memory location...
        // two same variables won't be created in the string pool


        str1 = "xyz"; // now str1 contains xyz instead of abc and its address will be changed.
        System.out.println(str1+" "+str2);
        System.out.println("str1 hashcode: "+str1.hashCode()+" String2 hashcode: "+str2.hashCode());


        String str3 = new String("abc");
        // when string object is created, it will be created in heap.
        // when the object holds the same value which is already present in string pool...it also gets the same address
        System.out.println("str1 hashcode: "+str1.hashCode()+" String2 hashcode: "+str2.hashCode()+" Str3 hashcode: "+str3.hashCode());


        String s1 = new String("vasavi");
        String s2 = new String("sura");

        System.out.println("String 1: "+s1);
        System.out.println("String 2: "+s2);
        System.out.println("String1 lowercase: "+s1.toLowerCase());
        System.out.println("String1 uppercase: "+s1.toUpperCase());
        System.out.println("String2 lowercase: "+s2.toLowerCase());
        System.out.println("String2 uppercase: "+s2.toUpperCase());
        System.out.println("String1 length: "+s1.length());
        System.out.println("String2 length: "+s2.length());
        System.out.println("String1 replace a to !: "+s1.replace("a","!"));
        System.out.println("Concatenation of String1 and String2: "+s2.concat(s1));
        System.out.println("Trim: "+(s2.trim()).concat(s1));
        System.out.println("String1 and String2 equals: "+s1.equals(s2));
        System.out.println("String1 and String2 equals ignoreCase: "+s1.equalsIgnoreCase(s2));
        System.out.println("Comparision of String1 and String2: "+s1.compareTo(s2));
        System.out.println("String1 in String2 position substring: "+s1.substring(2));
        System.out.println("String1 in String 2 4th position: "+s1.substring(2,4));
        System.out.println("String1 index of a: "+s1.indexOf("a"));
        System.out.println("String1 index of a in String2: "+s1.indexOf("v",2));
    }
}
