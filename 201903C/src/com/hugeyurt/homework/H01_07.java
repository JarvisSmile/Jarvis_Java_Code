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
				System.out.println(j+"������");
			}
		}
		System.out.println("\n101-200֮���ܹ���"+a+"������");

	}

}
/*7.	�ж�101-200֮���ж��ٸ����������������������*/