package com.hugeyurt.Collection;
import java.util.Comparator;
import java.util.TreeSet;

class IntComprator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        // TODO Auto-generated method stub
        return o2 - o1;
    }
}

public class Task2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<Integer> ts = new TreeSet<Integer>(new IntComprator());
        ts.add(10);
        ts.add(5);
        ts.add(20);
        System.out.println(ts);
    }
}
