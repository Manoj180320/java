package com.company;
import java.util.*;

public class ColHasset {
    public static void main(String[] args) {
        HashSet<String> hset=new HashSet<String>();
        hset.add("Rohit");
        hset.add("Virat");
        hset.add("Ashwin");
        hset.add("Virat");
        System.out.println(hset);
        hset.remove("Ashwin");
        Iterator itr=hset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
