package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Colmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<Integer, String>();
        map.put(1,"Apple");
        map.put(9,"Orange");
        map.put(3,"Banana");
        map.put(2,"Grapes");
        map.put(0,"Coconut");
        System.out.println(map);
        Iterator itr=map.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(map.get(2));
    }
}
