package com.hugeyurt.Collection;

import java.util.*;

public class IdentityHashMapTest
{
    public static void main(String[] args)
    {
        IdentityHashMap<String, Integer> ihm = new IdentityHashMap<String, Integer>();
        //HashMap<String, Integer> ihm = new HashMap<String, Integer>();
        
        ihm.put(new String("сОнд") , 89);
        ihm.put(new String("сОнд") , 78);
        ihm.put("java" , 93);
        ihm.put("java" , 98);
        
        System.out.println(ihm);
    }
}
