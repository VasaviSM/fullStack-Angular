package com.threads;

public class YieldDemo extends Thread{
    public void run()
    {
        System.out.println("Hello from run method");
        System.out.println(Thread.currentThread());
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YieldDemo  yd1=new YieldDemo();
        Thread d1=new Thread(yd1);
        YieldDemo  yd2=new YieldDemo();
        Thread d2=new Thread(yd2);

        d1.setName("d1thread");
        d1.setPriority(8);
        d2.setName("d2thread");
        d2.setPriority(6);
        d1.start();
        d2.start();

    }

}
