package com.hugeyurt.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DataMgrCollection {
    private Collection<Data> c=new ArrayList<Data>();
    boolean add(Data data)
    {
        if (null == data)
        {
            System.out.println("Err: input data is null!");
            return false;
        }
        
        boolean flag=c.add(data);
        if(flag)
        	System.out.println("Info: input sucessful! The add data is " + data);
        return flag;
    }
    
    boolean add(Data... data) //data[0] data[1]
    {
        for(int i = 0; i < data.length; ++i)
        {
            if (!add(data[i]))
            {
                return false;
            }
        }
        return true;
    }
    
    
    boolean remove(Data data)
    {
        if (null == data)
        {
            System.out.println("Err: input data is null!");
            return false;
        }
        boolean flag=c.remove(data);
        
        if (!flag)
        {
            System.out.println("Info: not find the data: " + data); //data.tostring();
        }
        
        return flag;
    }
    
    
    long size()
    {
    	return c.size();
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();
        for (Data data : c)
        {
            if (null != data)
            {
                sb.append(data).append(" | ");
            }
        }
        return sb.toString();
    }

    boolean modify(Data data, int m, int n)
    {

        if (null == data)
        {
            System.out.println("Info: modify[add new] sucessful!");
            return false;
        }
        for(Data d:c)
        {
        	if(d.equals(data))
        	{
        		d.setMN(m, n);
        		System.out.println("Info: modify[modify old] sucessful!");
        		return true;
        	}
        }
        return false;
    }
    int countByMN(int baseMN)
    {
        int sum = 0;
        Iterator<Data> it = c.iterator();
        while(it.hasNext())
        {
            Data d = it.next();
            if (d.sumMN() > baseMN)
            {
                ++sum;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       	Data d1 = new Data(100, 10);
	        Data d2 = new Data(200, 20);
	        Data d3 = d1;
	        DataMgrCollection dm = new DataMgrCollection();
	        System.out.println(dm.size());
	        dm.add(d1);
	        dm.add(d2);
	        dm.add(d3);
	        dm.add(d1);
	        dm.add(d2);
	        dm.add(d3);
	        System.out.println(dm);
	        System.out.println(dm.size());
	        dm.remove(d2);
	        System.out.println(dm);
	        System.out.println(dm.size());
	        //dm.modify(1, 30, 300);
	        //dm.modify(0, 40, 400);
	        dm.modify(d1 , 30, 300);
	        System.out.println(dm);
	        System.out.println(dm.size());
	        
	        System.out.println(dm.countByMN(200));
	}

}
