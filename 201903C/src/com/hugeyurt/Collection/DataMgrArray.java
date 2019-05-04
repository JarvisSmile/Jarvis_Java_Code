package com.hugeyurt.Collection;

public class DataMgrArray {
	private Data[] ds;
    private long len;
    
    DataMgrArray()
    {
        ds = new Data[10];
    }
    DataMgrArray(int max)
    {
        ds = new Data[max];
    }   
    boolean add(Data data)
    {
        if (null == data)
        {
            System.out.println("Err: input data is null!");
            return false;
        }
        
        for (int i = 0; i < ds.length; ++i) //i++
        {
            if (null == ds[i])
            {
                ds[i] = data;
                ++len;
                System.out.println("Info: input sucessful!, the pos is " + i);
                return true;
            }
        }
        
        System.out.println("Err: all space is full!");
        return false;
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
        
        boolean flag = false;
        for (int i = 0; i < ds.length; ++i) //i++
        {
            if (null != ds[i] && ds[i].equals(data))
            {
                ds[i] = null;
                flag  = true;
                --len;
                System.out.println("Info: remove sucessful!, the pos is " + i);
            }
        }  
        
        if (!flag)
        {
            System.out.println("Info: not find the data: " + data); //data.tostring();
        }
        
        return flag;
    }
    boolean modify(int pos, int m, int n)
    {
        if (pos < 0 || pos >= ds.length)
        {
            System.out.println("Err: input pos must from " + 0 + " to " + n);
            return false;
        }

        if (null == ds[pos])
        {
            System.out.println("Info: modify[add new] sucessful!, the pos is " + pos);
            ds[pos] = new Data(m, n);
            return true;
        }
        
        ds[pos].setMN(m, n);
        System.out.println("Info: modify[modify old] sucessful!, the pos is " + pos);
        return true;
    }
    long size()
    {
        return len;
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();
        for (Data data : ds)
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
        DataMgrArray dm = new DataMgrArray(5);
        dm.add(d1);
        dm.add(d2);
        dm.add(d3);
        dm.add(d1);
        dm.add(d2);
        dm.add(d3);
        System.out.println(dm);
	}

}
