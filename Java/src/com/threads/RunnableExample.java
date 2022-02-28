package com.threads;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Hi from run method");
        for(int i=1;i<=6;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        RunnableExample re1=new RunnableExample();
        RunnableExample re2=new RunnableExample();

        Thread th1=new Thread(re1);
        Thread th2=new Thread(re2);
        Thread.currentThread().setName("th1");
        System.out.println(Thread.currentThread());
        th1.start();
        Thread.currentThread().setName("th2");
        System.out.println(Thread.currentThread());

        th2.start();
        System.out.println(Thread.currentThread());


    }

}
