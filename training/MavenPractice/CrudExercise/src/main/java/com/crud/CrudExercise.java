package com.crud;

import java.sql.*;
import java.util.*;

public class CrudExercise {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
            System.out.println("connection acquired");
            st= conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Library Book Details");
        Scanner sc=new Scanner((System.in));
       boolean flags=true;
       while(flags) {
           System.out.println("Choose\n" + "1.Insert\n" + "2.Read\n" + "3.Update\n" + "4.Delete\n" + "5.Exit\n");
           int chose=sc.nextInt();
           switch (chose){

               case 1:System.out.println("Enter the id number");
                       int id=sc.nextInt();
                       System.out.println("Enter the book name");
                      String book_name=sc.next();
                      //System.out.println(book_name);
                      StringBuilder que= new StringBuilder("insert into library " + "values(" + id +", \'"+ book_name + "\')");
                     // System.out.println(que);

                      if(!st.execute(que.toString())){
                      System.out.println("Inserted into table");
                      }
                      else{
                          System.out.println("Not inserted");
                      }
                        break;
               case 2:
                   ResultSet r=st.executeQuery("select * from library");
                   System.out.println("Book Details");
                   while (r.next()){
                       System.out.println(r.getInt(1)+" "+r.getString(2));
                   }
                   break;
               case 3:System.out.println("Enter the id number to update");
                   int idup=sc.nextInt();
                   System.out.println("Enter the Updated book name ");
                   String book_nameup=sc.next();
                   StringBuilder que1= new StringBuilder("update library " + "set book_name=\'"+book_nameup+"\' where id="+idup);
                   if(st.execute(String.valueOf(que1))){
                       System.out.println("Updated the  table");
                   }
                    break;
               case 4:System.out.println("Enter the id number to delete");
                     int idDel=sc.nextInt();
                   StringBuilder quedel= new StringBuilder("delete from library where id="+idDel);
                   if(st.execute(String.valueOf(quedel))){
                       System.out.println("Deleted the value from table");
                   }
                   break;
               case 5:  flags=false;
                       System.out.println("---------------------You are Exiting---------------------");
                   break;
               default: System.out.println("Choose a valid number");
           }

       }



    }
}
