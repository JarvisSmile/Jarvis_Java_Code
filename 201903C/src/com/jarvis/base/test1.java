package com.jarvis.base;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m;
		m=sc.nextInt();
		sc.close();
		System.out.println("�������λ��Ϊ��"+m);
		System.out.println("�������λ����λΪ��"+m/100);
		System.out.println("�������λ��ʮλΪ��"+m%100/10);
		System.out.println("�������λ����λΪ��"+m%10);
	}

}