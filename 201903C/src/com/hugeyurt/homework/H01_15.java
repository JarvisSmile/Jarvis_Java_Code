package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_15 {
	/*�׳˺���*/
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
	/*�������ֵ*/
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
/*15.	����xֵ�����չ�ʽ����cos(x)��ֵ��ֱ�����һ��С��10-6Ϊֹ��cos(x)=1-x^2/2!+x^4/4!-x^6/6!+���� */