package com.javaoops;

class Calculator1{

    //int x;
    public void addition(int x, int y){
        System.out.println(x+y);
    }
}

class ScientificCalc extends Calculator1{

    public void area(int side){
        System.out.println(side*side);
    }
}

public class TestInheritance {
    public static void main(String[] args){

        //parent class constructor has access only to its own functions
        Calculator1 calc = new Calculator1();
        calc.addition(2,3);

        //since child class inherits from parent class it has access to both parent and its own functions
        ScientificCalc scCalc = new ScientificCalc();
        scCalc.area(5);
        scCalc.addition(6,7);

        //internally casting is done, so it becomes parent class and has no access to child properties
        Calculator1 obj = new ScientificCalc();
        obj.addition(10,30);
        //type is of parent class, object is of child class...
        //so will be of type class... can't use child class properties

        //down casting
        ScientificCalc obj1 = (ScientificCalc) new Calculator1();
        obj1.area(4);
        obj1.addition(5,6);
        //type is of child class, but parent object is down casted to child class
        //so can use properties of child class too

    }
}
