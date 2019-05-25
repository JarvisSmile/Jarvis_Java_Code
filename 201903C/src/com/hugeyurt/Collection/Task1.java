package com.hugeyurt.Collection;

import java.util.*;


class Data1 implements Comparable<Data1>
{
    private int m;
    private int n;
    
    Data1(int m, int n)
    {
        this.m = m;
        this.n = n;
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "m = " + m + ", n = " + n;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        //return super.equals(obj);
        if (this == obj)
        {
            return true;
        }
        
        if (obj != null && obj.getClass() == Data1.class)
        {
            Data1 data = (Data1)obj;
            return (m == data.m) && (n == data.n); 
        }
        
        return false;
    }
     
    @Override
    public int compareTo(Data1 o)
    {
        // TODO Auto-generated method stub
//        int k = (m + n) - (o.m + o.n);
//        if (k == 0)
//        {
//            return 1;
//        }
//        //return k;
//        return -k;
        
        int k = m - o.m;
        if (k == 0)
        {
            int a = o.n - n;
            if (0 == a)
            {
                a = 1;
            }
            return a;
        }

        return k;
    }
    
    void setMN(int m, int n)
    {
        this.m = m;
        this.n = n;
    }
    
    int sumMN()
    {
        return m + n;
    }
}

class Staff1 implements Comparable<Staff1>
{
    private String ID;
    private String name;
    private String position;
    
    Staff1(String ID, String name, String position)
    {
        this.ID = ID;
        this.name = name;
        this.position = position;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        if (obj == this)
        {
            return true;
        }
        
        if (obj != null && obj.getClass() == Staff1.class)
        {
            Staff1 staff = (Staff1)obj;
            return ID.equals(staff.ID); //return ID == staff.ID;
        }
        
        return false;
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return ID + ", " + name + ", " + position;
    }
    
    @Override
    public int compareTo(Staff1 o)
    {
        // TODO Auto-generated method stub
        return ID.compareTo(o.ID);
        //return o.ID.compareTo(ID); //return -ID.compareTo(o.ID);
    }
}

public class Task1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TreeSet<Data1> ts = new TreeSet<Data1>();
        ts.add(new Data1(1, 3));
        ts.add(new Data1(1, 3));
        ts.add(new Data1(0, 3));
        System.out.println(ts);
        
        TreeSet<Staff1> ts2 = new TreeSet<Staff1>();
        ts2.add(new Staff1("001", "n001", "cxy"));
        ts2.add(new Staff1("100", "n001", "cxy"));
        ts2.add(new Staff1("002", "n001", "cxy"));
        System.out.println(ts2);
        
        
    }

}
