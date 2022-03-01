package com.collections;

import java.util.*;

public class SetExample {
    static void hasSetMethod() {
        Set<String> set = new HashSet<String>();
        set.add("Manisha");
        set.add("Daksh");
        set.add("Harshada");
        set.add("Manisha");
        System.out.println("===========================set ===========================");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("=============================by using iterator ===========================");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static void LinkedSetMethod() {
        Set<String> set = new LinkedHashSet<>();
        set.add("Manisha");
        set.add("Daksh");
        set.add("Harshada");
        set.add("Manisha");
        System.out.println("===========================set ===========================");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("=============================by using iterator ===========================");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static void TreeSetMethod() {
        Set<String> set = new TreeSet<>();
        set.add("Manisha");
        set.add("Daksh");
        set.add("Harshada");
        set.add("Manisha");
        System.out.println("===========================set ===========================");
        for (String s : set) {
            System.out.println(s);
            System.out.println("=============================by using iterator ===========================");
            Iterator<String> itr = set.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
    public static void main(String[] args){
        hasSetMethod();
        LinkedSetMethod();
        TreeSetMethod();
    }
}

