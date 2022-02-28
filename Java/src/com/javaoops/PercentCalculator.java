package com.javaoops;

import java.util.ArrayList;
import java.util.Collection;

class Student{

    private int id,cmarks,pmarks,mmarks;
    private String name;

    Student(int id, String name, int cmarks, int pmarks, int mmarks){
        this.id = id;
        this.name =  name;
        this.cmarks = cmarks;
        this.pmarks = pmarks;
        this.mmarks = mmarks;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCmarks() {
        return this.cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return this.pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return this.mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void StudentDetails(){
        System.out.println("\nStudent ID: "+this.getId()+", Name: "+this.getName()+", Physics marks: "+this.getPmarks()+", Chemistry marks: "+this.getCmarks()+", Math marks: "+this.getMmarks());
    }
}

class PercentCalc{

    int cmarks,pmarks,mmarks,id;
    double total,percent;

    public int Calculate(int id,int cmarks,int pmarks, int mmarks){

        this.id=id;
        this.cmarks=cmarks;
        this.pmarks=pmarks;
        this.mmarks=mmarks;

        total=this.cmarks+this.mmarks+this.mmarks;
        percent=(total/300)*100;
        System.out.println("Student of ID "+this.id+" scored "+String.format("%.2f",this.percent)+"%");

        return (int) total;
    }

    /*

    public void MaxPercent(){

        this.total=total;
        double[] n = new double[0];

        for(int i=0;i<4;i++){
            n[i]=this.total;
        }
        double max = n[0];
        for(int i=0;i<4;i++){
            if(n[i]>max)
                max = n[i];
        }

        System.out.println("Maximum percent scored is "+max);
    }

     */

}

public class PercentCalculator {
    public static void main(String[] args){

        Student s1 = new Student(101,"Raj",45,55,67);
        PercentCalc calc1 = new PercentCalc();
        s1.StudentDetails();
        calc1.Calculate(101,45,55,67);

        Student s2 = new Student(102,"Rajesh",65,85,77);
        PercentCalc calc2 = new PercentCalc();
        s2.StudentDetails();
        calc2.Calculate(102,65,85,77);

        Student s3 = new Student(103,"Suraj",43,55,60);
        PercentCalc calc3 = new PercentCalc();
        s3.StudentDetails();
        calc3.Calculate(103,43,55,60);

        Student s4 = new Student(104,"Tom",71,65,70);
        PercentCalc calc4 = new PercentCalc();
        s4.StudentDetails();
        calc4.Calculate(104,71,65,70);

        //PercentCalc calc = new PercentCalc();
        //calc.MaxPercent();

    }
}
