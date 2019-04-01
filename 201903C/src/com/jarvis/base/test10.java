package com.jarvis.base;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int j=1;j<10;j++) {
			int a=1,b=j,m=j,s=0;
//a表示现在是第几位，b表示当前重复数值，m表示当前叠加的数，s求和
			System.out.print("s="+m);
			for(int i=1;i<num;i++) {
				s+=m;
				a*=10;
				m+=b*a;
				System.out.print("+"+m);
			}
			s+=m;
			System.out.println("="+s);
		}

	}

}
