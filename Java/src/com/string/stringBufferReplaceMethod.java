package com.string;

public class stringBufferReplaceMethod {
    public static void main(String[] args){
        StringBuilder sb1 =  new StringBuilder("Hello");
        sb1.replace(1,4,"yell");
        System.out.println(sb1);
        System.out.println(sb1.reverse());

        sb1.delete(2,4);
        System.out.println(sb1);

    //reverse- reverse the order of the string
    //delete


            StringBuffer sb=new StringBuffer();
            sb.append("Vasavi ");
            StringBuilder sd=new StringBuilder(sb);
            sd.append(776);
            System.out.println(sd);

    }

}
