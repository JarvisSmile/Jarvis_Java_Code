package com.hugeyurt.Collection;

import java.util.*;
public class LinkedHashMapTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        HashMap<String, Integer> scores = new LinkedHashMap<String, Integer>();
        //HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("����", 80);
        scores.put("Ӣ��", 82);
        scores.put("��ѧ", 76);
        for (Object key : scores.keySet())
        {
            System.out.println(key + "-->" + scores.get(key));
        }
        
        for (Object val : scores.values())
        {
            System.out.println(val);
        }
        
        for (Map.Entry<String, Integer> item : scores.entrySet())
        {
            System.out.println(item.getKey() + " ---> " + item.getValue());
        }
    }

}
