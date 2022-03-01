package com.iostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some lines");
        try {
            String lines=br.readLine();
            if(lines.length()<=0)
            {
                System.err.println("Enter the text..");
            }
            else {
                System.out.println("You entered!!" + lines);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
