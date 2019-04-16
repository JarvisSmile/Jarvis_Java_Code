package com.hugeyurt.homework;

public class H01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,k=1,a=0;
		for(int j=101;j<200;j++) {
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					k=0;
					break;
				}
				k=1;
			}
			if(k==1) {
				a++;
				System.out.println(j+"是素数");
			}
		}
		System.out.println("\n101-200之间总共有"+a+"个素数");

	}

}
/*7.	判断101-200之间有多少个素数，并输出所有素数。*/