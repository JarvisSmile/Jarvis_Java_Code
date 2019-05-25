package com.hugeyurt.Collection;

import java.util.*;

class R2 implements Comparable<R2>
{
    int count;
    public R2(int count)
    {
        this.count = count;
    }
    public String toString()
    {
        return "R[count:" + count + "]";
    }
    // 根据count来判断两个对象是否相等。
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == R2.class)
        {
            R2 r = (R2)obj;
            return r.count == this.count;
        }
        return false;
    }
    // 根据count属性值来判断两个对象的大小。
    public int compareTo(R2 obj)
    {
//        R r = (R)obj;
//        return count > r.count ? 1 :
//            count < r.count ? -1 : 0;
        return count - obj.count;
    }
//	@Override
//	public int compareTo(R2 o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}

class RComprator implements Comparator<R2>
{
    @Override
    public int compare(R2 o1, R2 o2)
    {
        // TODO Auto-generated method stub
        return o2.count - o1.count;
    }
}
public class TreeMapTest
{
    public static void main(String[] args)
    {
        TreeMap<R2, String> tm = new TreeMap<R2,String>();
        tm.put(new R2(3) , "语文");
        tm.put(new R2(-5) , "数学");
        tm.put(new R2(9) , "英语");
        System.out.println(tm);
        // 返回该TreeMap的第一个Entry对象
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        
        // 返回该TreeMap的最后一个key值
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        
        // 返回该TreeMap的比new R(2)大的最小key值。
        System.out.println(tm.higherKey(new R2(2)));
        System.out.println(tm.lowerKey(new R2(2)));
        
        // 返回该TreeMap的比new R(2)小的最大的key-value对。
        System.out.println(tm.higherEntry(new R2(2)));
        System.out.println(tm.lowerEntry(new R2(2)));
        
        // 返回该TreeMap的子TreeMap 
        System.out.println(tm.subMap(new R2(-5) , new R2(4)));
        
        
        TreeMap<R2, String> tm2 = new TreeMap<R2,String>(new RComprator());
        tm2.put(new R2(3) , "语文");
        tm2.put(new R2(-5) , "数学");
        tm2.put(new R2(9) , "英语");
        System.out.println(tm2);
        System.out.println(tm2.subMap(new R2(9) , new R2(0)));
    }
}
