package com.iostream;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {

        /*Console c=System.console();

        System.out.println("enter the strings");

        char [ ] text=new char[10];
        text=c.readPassword();

        String pwd= String.valueOf(text);
        //System.console().readLine();
        //System.out.println(text);
        System.out.println(pwd);*/


        Console c1=null;
        try {
            c1=System.console();
            if(c1!=null)
            {

                String s1=c1.readLine();
                System.out.println(s1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }

    }

}
