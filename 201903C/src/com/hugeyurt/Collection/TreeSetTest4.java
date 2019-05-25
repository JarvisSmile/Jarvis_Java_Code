package com.hugeyurt.Collection;

import java.util.Comparator;
import java.util.TreeSet;


class M implements Comparable<M>
{
    int age;

    public M(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return "M[age:" + age + "]";
    }
    
    @Override
    public int compareTo(M o)
    {
        // TODO Auto-generated method stub
        return age - o.age;
    }
}

class MyComprator implements Comparator<M>
{
    @Override
    public int compare(M o1, M o2)
    {
        // TODO Auto-generated method stub
        //return o1.age > o2.age ? -1 : o1.age < o2.age ? 1 : 0;
        return o2.age - o1.age;
    }  
}


public class TreeSetTest4
{
    public static void main(String[] args)
    {

        TreeSet<M> ts = new TreeSet<M>(new MyComprator());

        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }
}
