package com.jarvis.base;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*最大公约数：辗转相除法*/
		/*最小公倍数：两数相乘再除以最大公约数*/
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		sc.close();
		/*mcd:最大公约数，lcm最小公倍数*/
		int mcd,lcm;
		int a,b,c;
		if(m>n) {
			a=m;b=n;
		}
		else {
			a=n;b=m;
		}
		/*
		 for(int i=n;i<0;i--){
		 	if(m%i)
		 }
		 * */
		while(b!=0)  /* 余数不为0，继续相除，直到余数为0 */ 
		{ 
			c=a%b; 
			a=b;  
			b=c;
		}
		mcd=a;
		lcm=m*n/mcd;
		System.out.print(m+"和"+n+"的"+"mcd:"+mcd+"\tlcm:"+lcm);
	}

}
