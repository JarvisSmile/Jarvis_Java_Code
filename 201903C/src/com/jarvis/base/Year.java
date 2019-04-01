package com.jarvis.base;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year;
		year=sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.print(year+"是闰年");
		}
		else {
			System.out.print(year+"不是闰年");
		}
	}

}
