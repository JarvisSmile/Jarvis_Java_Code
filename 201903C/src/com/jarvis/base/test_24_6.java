package com.jarvis.base;

import java.util.Scanner;

public class test_24_6 {

	public static String Y(int y) {
		if(y%4==0&&y%100!=0||y%400==0) {
			return "是闰年";
		}
		else {
			return "不是闰年";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		String a=Y(y);
		System.out.print(y+a);
	}

}
