package com.mycalc;

import java.util.Scanner;

class SimpleCalculator{
    private int num1, num2;

    //we use this to set the values from user
    SimpleCalculator(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void addition(){
        int result=this.num1+this.num2;
        System.out.println(num1+" + "+num2+" = "+result);
    }

    public void subtraction(){
        int result=num1-num2;
        System.out.println(num1+" - "+num2+" = "+result);
    }

    public void multiplication(){
        int result=num1*num2;
        System.out.println(num1+" * "+num2+" = "+result);
    }

    public void division(){
        int result=num1/num2;
        System.out.println(num1+" / "+num2+" = "+result);
    }
}

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        SimpleCalculator calc = new SimpleCalculator(num1,num2);
        calc.addition();
        calc.subtraction();
        calc.multiplication();
        calc.division();
    }
}
