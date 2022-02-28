package com.collections;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

class ListManager{

    public List<String> removeElements(List<String> list1,List<String> list2){
        list1.removeAll(list2);
        return list1;
    }

    /*public List<String> getArrayList(String[] elements){

    }*/


}



public class Exercise {

    static void CollectionTypes(){
        Queue<String> x = new LinkedList<>();
        x.add("one");
        x.add("two");
        x.add("one");
        System.out.println(x.poll());  //poll returns the head of the queue
        /*for (String s:x) {
            System.out.println(s);
        }*/
    }

    /*static class Tester {
        List<String> list1 = new ArrayList<String>();//line 1
        List<Object> list2 = list1;//line 2
        list2.add(new Integer(12));//line 3
        System.out.println("\n"+list2.size());//line 4
    }*/


    static void TestGenericConversion() {
            List<String> list=new ArrayList<String>( );
            list.add("one");
            //list.add(2);  //it won't accept int type, should pass String
            list.add("2");
            System.out.println("\n"+list.get(1).length());
    }

    static void Test(){
        Integer a = new Integer(4);
        Integer b = new Integer(8);
        Integer c = new Integer(4);
        HashSet hs = new HashSet();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        System.out.println("\n"+hs);
    }

    public static void main(String[] args) {
        CollectionTypes();
        //Tester();
        TestGenericConversion();
        Test();
        ListManager l = new ListManager();
        List<String> list1 = new ArrayList<>();
        list1.add("Mango");
        list1.add("Orange");
        list1.add("Apple");
        list1.add("Watermelon");
        list1.add("Papaya");

        List<String> list2 = new ArrayList<>();
        list2.add("Mellon");
        list2.add("Apple");
        list2.add("Watermelon");
        list2.add("CustardApple");
        list2.add("PineApple");
        list2.add("Banana");

        List<String> flist = l.removeElements(list1,list2);
        System.out.println("\n"+flist);
    }
}
