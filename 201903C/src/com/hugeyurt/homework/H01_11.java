package com.hugeyurt.homework;

public class H01_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1=2,a2=3,b1=1,b2=2,s=a1/b1+a2/b2,a,b;
		for(int i=3;i<=20;i++) {
//			System.out.println("s="+s);
			a=a2;a2+=a1;a1=a;
			b=b2;b2+=b1;b1=b;
			s+=a2/b2;
		}
		System.out.println("s="+s);
	}

}
/*11.	有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。*/