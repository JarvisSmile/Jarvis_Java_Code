package com.jarvis.base;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���Լ����շת�����*/
		/*��С����������������ٳ������Լ��*/
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		sc.close();
		/*mcd:���Լ����lcm��С������*/
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
		while(b!=0)  /* ������Ϊ0�����������ֱ������Ϊ0 */ 
		{ 
			c=a%b; 
			a=b;  
			b=c;
		}
		mcd=a;
		lcm=m*n/mcd;
		System.out.print(m+"��"+n+"��"+"mcd:"+mcd+"\tlcm:"+lcm);
	}

}