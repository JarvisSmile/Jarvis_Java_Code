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
    // ����count���ж����������Ƿ���ȡ�
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
    // ����count����ֵ���ж���������Ĵ�С��
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
        tm.put(new R2(3) , "����");
        tm.put(new R2(-5) , "��ѧ");
        tm.put(new R2(9) , "Ӣ��");
        System.out.println(tm);
        // ���ظ�TreeMap�ĵ�һ��Entry����
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        
        // ���ظ�TreeMap�����һ��keyֵ
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        
        // ���ظ�TreeMap�ı�new R(2)�����Сkeyֵ��
        System.out.println(tm.higherKey(new R2(2)));
        System.out.println(tm.lowerKey(new R2(2)));
        
        // ���ظ�TreeMap�ı�new R(2)С������key-value�ԡ�
        System.out.println(tm.higherEntry(new R2(2)));
        System.out.println(tm.lowerEntry(new R2(2)));
        
        // ���ظ�TreeMap����TreeMap 
        System.out.println(tm.subMap(new R2(-5) , new R2(4)));
        
        
        TreeMap<R2, String> tm2 = new TreeMap<R2,String>(new RComprator());
        tm2.put(new R2(3) , "����");
        tm2.put(new R2(-5) , "��ѧ");
        tm2.put(new R2(9) , "Ӣ��");
        System.out.println(tm2);
        System.out.println(tm2.subMap(new R2(9) , new R2(0)));
    }
}
