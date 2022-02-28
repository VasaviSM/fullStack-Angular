package com.javaoops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}

public class Sorting1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n1,n2,n3,n4;
        String s1,s2,s3,s4;

        n1 = input.nextInt();
        input.nextLine();
        s1 = input.nextLine();


        n2 = input.nextInt();
        input.nextLine();
        s2 = input.nextLine();

        n3 = input.nextInt();
        input.nextLine();
        s3 = input.nextLine();

        n4 = input.nextInt();
        input.nextLine();
        s4 = input.nextLine();

        Person user1 = new Person(n1,s1);
        user1.setId(n1);
        user1.setName(s1);
        Person user2 = new Person(n2,s2);
        user2.setId(n2);
        user2.setName(s2);
        Person user3 = new Person(n3,s3);
        user3.setId(n3);
        user3.setName(s3);
        Person user4 = new Person(n4,s4);
        user4.setId(n4);
        user4.setName(s4);

        ArrayList<Person> mylist = new ArrayList<>();
        mylist.add(user1);
        mylist.add(user2);
        mylist.add(user3);
        mylist.add(user4);

        Collections.sort(mylist);

        System.out.println(mylist);

    }
}
