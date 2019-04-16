package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_16_2 {

	public static double factorial(double n) {
		double value=1;
		if(n==0)
			return value;
		else if (n>0){
			for(int i=1;i<=n;i++)
				value*=i;
			return value;
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,e=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();
		for(double i=0;i<=n;i++) {
			e+=1/factorial(i);
		}
		System.out.print(e);
		
	}

}
/*编写一个程序，求e的值.1+1/1!+1/2!+1/3!++1/4!+……+1/n!*/