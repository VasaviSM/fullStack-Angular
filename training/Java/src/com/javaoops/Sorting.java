package com.javaoops;
/*
import java.util.*;

class Sortby{
    private  int id;
    private String name;

    public Sortby() {}
    public Sortby(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;}

    public void setId(int id){
        this.id = id;}

    public String getName(){
        return this.name;}

    public void setName(String name){
        this.name = name;}

    public void sort( Sortby[] sb, int n) {
        Sortby temp=new Sortby();
        for (int i = 0; i<n-1; i++){
            for(int j=0;j<n-i-1; j++){
                if(sb[j].getId()>sb[j+1].getId()){
                    temp=sb[j];
                    sb[j]=sb[j+1];
                    sb[j+1]=temp;
                }

            }
            System.out.println();
        }
    }

    public void display(Sortby[] sb, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("The Id is "+sb[i].getId());
            System.out.println("The Name is "+sb[i].getName());
        }
    }
}


public class Sorting{
    public static void main(String[] args) {
        int n;
        int id;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        Sortby[] sb =new Sortby[n];
        for (int i = 0; i < n; i++) {
            sb[i]=new Sortby();
            System.out.println("Enter the student id");
            id = sc.nextInt();
            sc.nextLine();
            sb[i].setId(id);
            System.out.println("Enter the student name");
            name = sc.nextLine();
            sb[i].setName(name);
        }
        Sortby obj=new Sortby();
        obj.sort(sb,n);
        obj.display(sb,n);
    }
}
*/

public class Sorting {
    public static void main(String[] args){
        int n;
        int id;
        String name;

    }
}