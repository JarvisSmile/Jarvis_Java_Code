package com.hugeyurt.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class DataMgrHashSet {
	private HashSet <Data> hs=new HashSet<Data>();
    boolean add(Data data)
    {
        if (null == data)
        {
            System.out.println("Err: input data is null!");
            return false;
        }
        
        boolean flag=hs.add(data);
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
    long size()
    {
    	return hs.size();
    }
    boolean remove(Data data)
    {
        if (null == data)
        {
            System.out.println("Err: input data is null!");
            return false;
        }
        boolean flag=hs.remove(data);
        
        if (!flag)
        {
            System.out.println("Info: not find the data: " + data); //data.tostring();
        }
        
        return flag;
    }
    int countByMN(int baseMN)
    {
        int sum = 0;
        Iterator<Data> it = hs.iterator();
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
    boolean modify(Data data, int m, int n)
    {

        if (null == data)
        {
            System.out.println("Info: modify[add new] sucessful!");
            return false;
        }
        for(Data d:hs)
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
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();
        for (Data data : hs)
        {
            if (null != data)
            {
                sb.append(data).append(" | ");
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	Data d1 = new Data(100, 10);
        Data d2 = new Data(200, 20);
        Data d3 = d1;
		DataMgrHashSet dmhs=new DataMgrHashSet();
        System.out.println(dmhs.size());
        dmhs.add(d1);
        dmhs.add(d2);
        dmhs.add(d3);
        dmhs.add(d1);
        dmhs.add(d2);
        dmhs.add(d3);
		System.out.println(dmhs);
        System.out.println(dmhs.size());
        dmhs.remove(d2);
        System.out.println(dmhs);
        System.out.println(dmhs.size());
        //dm.modify(1, 30, 300);
        //dm.modify(0, 40, 400);
        dmhs.modify(d1 , 30, 300);
        System.out.println(dmhs);
        System.out.println(dmhs.size());
        System.out.println(dmhs.countByMN(200));
	}

}
