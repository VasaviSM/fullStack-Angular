package com.threads;

public class sycDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Thread obj1=new Thread(new Runnable() {

            @Override
            public void run() {

                for(int i=1;i<=5;i++)
                {
                    new A().Amethod();
                }
            }
        });
        Thread obj2=new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=1;i<=5;i++)
                {
                    new B().BMethod();
                }
            }
        });
        obj1.start();
        obj2.start();


    }

}
