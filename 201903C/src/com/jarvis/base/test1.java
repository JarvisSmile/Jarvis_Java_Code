package com.jarvis.base;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m;
		m=sc.nextInt();
		sc.close();
		System.out.println("输入的三位数为："+m);
		System.out.println("输入的三位数百位为："+m/100);
		System.out.println("输入的三位数十位为："+m%100/10);
		System.out.println("输入的三位数个位为："+m%10);
	}

}
