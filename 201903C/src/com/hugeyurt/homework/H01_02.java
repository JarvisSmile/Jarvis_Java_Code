package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,k=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				k=0;
				System.out.print(num+"不是素数");
				break;
			}
		}
		if(k==1) {
			System.out.print(num+"是素数");
		}
	}

}
/*判断素数*/