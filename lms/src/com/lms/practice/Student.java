package com.lms.practice;

import java.util.Scanner;

class StudentDetails{
    private int roll;
    private String name;
    private int marks;

    public StudentDetails(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public StudentDetails(){
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return this.marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String studentresult(){
        if(this.getMarks()>500){
            return "Student Result is : Pass";
        }
        else{
            return "Student Result is : Fail";
        }
    }

    @Override
    public String toString() {
        return "Student Roll is : " + this.getRoll() + "\nStudent Name is : " + this.getName()
                + "\nStudent Marks is : " + this.getMarks() + "\n" + this.studentresult();
    }

}
public class Student {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details of student in this format \n rollNo:name:marks");
        String str = input.next();
        String []arr = str.split(":");
        StudentDetails student =new StudentDetails(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
        System.out.println(student);

    }
}