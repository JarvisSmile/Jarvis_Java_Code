package com.hugeyurt.Collection;

import java.util.HashSet;
import java.util.Iterator;

class R1
{
	int count;
	public R1(int i) {
		// TODO Auto-generated constructor stub
		this.count=i;
	}
	@Override
	public String toString() {
		return "R [count=" + count + "]";
	}
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == R.class)
        {
            R r = (R) obj;
            return this.count == r.count;
        }
        return false;
    }
	public int hashCode()
	{
		return this.count;
	}
}
public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<R1> hs=new HashSet<R1>();
		hs.add(new R1(5));
		hs.add(new R1(-3));
		hs.add(new R1(9));
		hs.add(new R1(-2));
		System.out.println(hs);
		Iterator it=hs.iterator();
		R1 first=(R1)it.next();
		first.count=-3;
		System.out.println(hs);
		hs.remove(new R1(-3));
		System.out.println(hs);
		System.out.println("hs是否包含count为-3的R对象"+hs.contains(new R(-3)));
		System.out.println("hs是否包含count为-2的R对象"+hs.contains(new R(-2)));
	}

}
