package com.company;
import java.util.*;

public class ColLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> llist=new LinkedList<String>();
        llist.add("Tony");
        Iterator itr=llist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        llist.addLast("Hulk");
        llist.addFirst("Ironman");
        System.out.println(llist);
        LinkedList<String>llist2=new LinkedList<String>();
        llist2.add("Hello");
        llist2.add("Alizabeeth");
        llist2.add("Jack");
        llist2.add("Ram");
        for (int i=0;i<llist2.size();i++){

            System.out.println(llist2.get(i));
        }
        llist.addAll(1,llist2);
        System.out.println(llist);
        llist.removeFirst();
        llist.removeLast();
        llist.removeFirst();
        llist.add("Ram");
        System.out.println(llist.peek());
        System.out.println( llist.poll());
        llist.push("Pushed");
        llist.pop();
        System.out.println(llist);
        llist.removeAll(llist2);
        System.out.println(llist);
    }
}
