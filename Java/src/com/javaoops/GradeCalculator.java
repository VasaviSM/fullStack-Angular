package com.javaoops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class GradeCalc{
    int id;
    String name;
    int cmarks;
    int pmarks;
    int mmarks;

    public GradeCalc(int id, String name, int cmarks, int pmarks, int mmarks) {
        this.id=id;
        this.name=name;
        this.cmarks=cmarks;
        this.pmarks=pmarks;
        this.mmarks=mmarks;
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
    public int getCmarks() {
        return cmarks;
    }
    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }
    public int getPmarks() {
        return pmarks;
    }
    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }
    public int getMmarks() {
        return mmarks;
    }
    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public double avgMarks() {
        return (this.cmarks + this.pmarks + this.mmarks) / 3;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void checkGrade()
    {
        double marks=this.avgMarks();
        if(marks>90&&marks<=100)
            System.out.println("Student of ID "+this.id+" has scored "+String.format("%.2f",this.avgMarks())+" and the grade is A");
        else if(marks>80&&marks<=90)
            System.out.println("Student of ID "+this.id+" has scored "+String.format("%.2f",this.avgMarks())+" and the grade is B");
        else if(marks>70&&marks<=80)
            System.out.println("Student of ID "+this.id+" has scored "+String.format("%.2f",this.avgMarks())+" and the grade is C");
        else
            System.out.println("Student of ID "+this.id+" has scored "+String.format("%.2f",this.avgMarks())+" and the grade is Average");
    }
}

public class GradeCalculator{

    public static GradeCalc StudentWithMaxScore(ArrayList<GradeCalc> std){
        int len = std.size();
        int index = 0;
        double max = std.get(index).avgMarks();
        for(int i=0;i<len;i++){
            if(max>std.get(i).avgMarks()){
                index = i;
                max = std.get(i).avgMarks();
            }
        }
        return std.get(index);
    }

    public static void main(String[] args)
    {
        ArrayList<GradeCalc> student = new ArrayList<GradeCalc>();
        student.add(new GradeCalc(101,"Raj",90,65,80));
        student.add(new GradeCalc(102,"Rajesh",86,94,95));
        student.add(new GradeCalc(103,"Suraj",40,43,48));
        student.add(new GradeCalc(104,"Tom",78,82,84));

        Iterator<GradeCalc> itr = student.iterator();
        while(itr.hasNext()){
            itr.next().checkGrade();
        }

        GradeCalc stud = StudentWithMaxScore(student);
        System.out.println("\nStudent who scored the highest marks is "+stud);
    }
}
