package com.javaoops;

class Calculator{

    public void addition(int a,int b){
        System.out.println(a+b);
    }

    /*
    can not have same type of parameter with interchange
    public void addition(int b, int a){
    }
    */

    public void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void addition(float a, float b){
        System.out.println(a+b);
    }
}

public class TestPolymorphism {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.addition(3,5);
        calc.addition(2.3f,6.6f);
        calc.addition(1,2,3);
    }
}
