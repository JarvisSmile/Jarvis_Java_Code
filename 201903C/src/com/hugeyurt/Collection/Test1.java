package com.hugeyurt.Collection;

import java.util.Collection;
import java.util.HashSet;

class Staff
{
    private String ID;
    private String name;
    private String position;
    
    Staff(String ID, String name, String position)
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
        
        if (obj != null && obj.getClass() == Staff.class)
        {
            Staff staff = (Staff)obj;
            return ID.equals(staff.ID); //return ID == staff.ID;
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        // TODO Auto-generated method stub
        return ID.hashCode();
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return ID + ", " + name + ", " + position;
    }
}

public class Test1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        HashSet<Staff> c = new HashSet<Staff>(); //Collection c
        c.add(new Staff("001", "n001", "cxy"));
        c.add(new Staff("001", "n001", "cxy"));
        c.add(new Staff("002", "n002", "cxy"));
        System.out.println(c);
    }

}