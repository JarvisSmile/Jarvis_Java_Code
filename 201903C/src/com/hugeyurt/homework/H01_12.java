package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_12 {
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
/*12.	一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同*/