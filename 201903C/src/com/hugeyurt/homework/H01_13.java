package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_13 {
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
/*13.	输入2个正整数m,n，求其最大公约数和最小公倍数。*/