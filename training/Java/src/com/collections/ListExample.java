package com.collections;

import java.util.*;

public class ListExample {
    static  void ArrayListMethod(){
        List<String> list = new ArrayList<String>();
        list.add("Manisha");
        list.add("Daksh");
        list.add("Harshada");

        for(String s : list){
            System.out.println(s);
        }
    }

    static  void LinkedListMethod(){
        List<String> list = new LinkedList<>();
        list.add("Manisha");
        list.add("Daksh");
        list.add("Harshada");
        System.out.println("=============================Linked list ===========================");
        for(String s : list){
            System.out.println(s);
        }
    }
    static void DequeExample(){
        Deque<String> queue = new ArrayDeque<String>();
        queue.add("Manisha");
        queue.add("Daksh");
        queue.add("Harshada");
        queue.addFirst("1234");
        queue.addLast("pqr");
        queue.removeFirst();
        System.out.println("=====================Deque=======================");
        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    public static void main(String[] args) {
        ArrayListMethod();
        LinkedListMethod();
        DequeExample();
    }
}
