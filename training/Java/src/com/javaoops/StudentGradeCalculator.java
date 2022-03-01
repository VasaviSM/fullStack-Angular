package com.javaoops;


import java.util.ArrayList;
import java.util.Collections;

class Student1{

    private int id;
    private String name;

    Student1(int id, String name){
        this.id = id;
        this.name =  name;

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

    public int compareTo(Student1 o){
        return this.getName().compareTo(o.getName());
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args){

        Student1 stud1 = new Student1(101,"Rajesh");
        Student1 stud2 = new Student1(103,"Suraj");
        Student1 stud3 = new Student1(102,"Tom");
        Student1 stud4 = new Student1(104,"Abhi");

        /*ArrayList<Student1> studlist = new ArrayList<>();
        studlist.add(stud1);
        studlist.add(stud2);
        studlist.add(stud3);
        studlist.add(stud4);

        Collections.sort(studlist);

        System.out.println(studlist);*/


        ArrayList<Student1> studlist = new ArrayList<>();
        studlist.add(stud1);
        studlist.add(stud2);
        studlist.add(stud3);
        studlist.add(stud4);

        //Collections.sort(studlist);

        System.out.println(studlist);

    }
}
