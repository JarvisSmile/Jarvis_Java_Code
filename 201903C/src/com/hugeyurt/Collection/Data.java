package com.hugeyurt.Collection;

public class Data {
	private int m;
    private int n;
    
    Data(int m, int n)
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
    public void setMN(int m, int n)
    {
        this.m = m;
        this.n = n;
    }
    public int sumMN()
    {
        return m + n;
    }
//  @Override
//  public boolean equals(Object obj)
//  {
//      if (this == obj)
//      {
//          return true;
//      }
//      
//      if (obj != null && obj.getClass() == Data.class)
//      {
//          Data data = (Data)obj;
//          return (m == data.m) && (n == data.n); 
//      }
//      
//      return false;
//  }
}
