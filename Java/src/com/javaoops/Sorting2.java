package com.javaoops;

import java.util.ArrayList;
import java.util.Collections;

class Person1 implements Comparable<Person1>{

    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
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
        return "id=" + this.id + ", name= " + this.name+"\n";
    }

    @Override
    public int compareTo(Person1 o) {
        if(this.getId()==o.getId())
            return this.getName().compareTo(o.getName());
        else
            return this.getId().compareTo(o.getId());
    }

}

public class Sorting2 {
    public static void main(String[] args){

        Person1 user1 = new Person1(101,"Raj");
        Person1 user2 = new Person1(102,"Tom");
        Person1 user3 = new Person1(103,"Suraj");
        Person1 user4 = new Person1(104,"Abhi");

        ArrayList<Person1> mylist = new ArrayList<>();
        mylist.add(user1);
        mylist.add(user2);
        mylist.add(user3);
        mylist.add(user4);

        Collections.sort(mylist);

        System.out.println(mylist);

    }
}
