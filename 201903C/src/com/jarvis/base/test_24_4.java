package com.jarvis.base;

import java.util.Random;

public class test_24_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Random random1 = new Random(10);
		//Scanner sc=new Scanner(System.in);
		System.out.print("数组为a={");
		for(int i=0;i<10;i++) {
			a[i]=Math.abs(random1.nextInt()%100);
			System.out.print(a[i]+"  ");
		}
		System.out.println("}");
		for(int i=0;i<a.length/2;i++) {
			int t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
		}
		System.out.print("数组为a={");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println("}");
	}

}
