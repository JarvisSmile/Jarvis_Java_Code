package com.jarvis.base;

import java.util.Scanner;

public class test_24_8 {
	public static int fib(int n)
	{
	    if(n==1||n==2)
	        return 1;
	    return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			num+=fib(i);
		}
		System.out.print(num);
	}


}
