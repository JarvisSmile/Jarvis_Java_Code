package com.jarvis.base;

import java.util.Arrays;
import java.util.Random;

public class test_24_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Random random1 = new Random(10);
		System.out.print("����Ϊa={");
		for(int i=0;i<10;i++) {
			a[i]=Math.abs(random1.nextInt()%100);
			System.out.print(a[i]+"  ");
		}
		System.out.println("}");
		//��������
		Arrays.sort(a);
		System.out.print("����Ϊa={");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println("}");
		
		//��������(ѡ��)
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print("����Ϊa={");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println("}");
	}

}