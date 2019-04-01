package com.jarvis.base;
import java.lang.Math;
import java.util.Scanner;

public class test15 {
	/*阶乘函数*/
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
	/*求单项的数值*/
	public static double danxiang(double x,double n) {

		double value=Math.pow(x,n)/factorial(n);
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value=0,x,num;
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		for(int i=0;i<36;) {
			num=danxiang(x,i);
			if(num<Math.pow(10,-6))
				break;
			if(i/2%2==1) 
				value-=num;
			else
				value+=num;				
			i+=2;
		}
		System.out.print("cos("+x+")="+value);
	}
}
