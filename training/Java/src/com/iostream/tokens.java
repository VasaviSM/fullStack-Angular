package com.iostream;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer text = new StringTokenizer(s);
        System.out.println(text.countTokens());
        System.out.println(text.hasMoreElements()); //returns boolean
        while(text.hasMoreTokens()){
            System.out.println(text.nextToken());
        }
    }
}
