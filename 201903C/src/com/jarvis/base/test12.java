package com.jarvis.base;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>9999&&num<100000) {

			if((num/10000)==(num%10)&&(num/1000%10)==(num%100/10)) {
				System.out.print(num+"是回文");
			}
			else {
				System.out.print(num+"不是回文");
			}
		}
		else
		{
			System.out.println("数据异常");
		}
	}

}
