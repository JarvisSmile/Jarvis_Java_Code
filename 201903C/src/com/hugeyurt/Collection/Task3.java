package com.hugeyurt.Collection;

import java.util.Arrays;

public class Task3
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] strs = new String[]{"c", "b", "a"};
        
        String[] strs2 = Arrays.copyOf(strs, 2);
        
        String[] strs3 = Arrays.copyOfRange(strs, 1, 2);
        
        int[] b = new int[10];
        Arrays.fill(b, 10);
        
        Arrays.sort(strs);  //Arrays.sort(strs, ±È½ÏÆ÷);
        System.out.println(Arrays.toString(strs));
//        for (String item : strs)
//        {
//            System.out.println(item);
//        }
    }

}
