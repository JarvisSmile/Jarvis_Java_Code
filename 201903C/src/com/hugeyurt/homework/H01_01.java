package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

/*分割三位数*/
