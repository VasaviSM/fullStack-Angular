package com.generic;

class MyClass<T> {


    private T mydata;

    public MyClass(T mydata)
    {
        this.mydata=mydata;
    }

    public T getmyData()
    {
        return this.mydata;
    }


}


public class GenClassDemo {

    public static void main(String[] args) {
        MyClass <Float> obj1=new MyClass(3.4);

        System.out.println(obj1.getmyData());

        MyClass <String> obj2=new MyClass("Hello");
        System.out.println(obj2.getmyData());

    }

}
