package com.hugeyurt.homework;

public class H01_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=1,a2=1,s=a1+a2,a,j=3;
		System.out.print(a1+"\t\t\t"+a2+"\t\t\t"+s+"\t\t\t");
		for(int i=3;i<=40;i++) {
			s+=a2;
			a=a2;a2+=a1;a1=a;
			System.out.print(s+"\t\t\t");
			j++;
			if(j==4) {
				j=0;

				System.out.println("\t\t\t");
			}
		}
	}
}
/*14.	�������ӡ���������У�1��1��2��3��5��8��13������ǰ40�ÿ�����4��������쳲��������У�*/