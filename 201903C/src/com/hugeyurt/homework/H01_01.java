package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m;
		m=sc.nextInt();
		sc.close();
		System.out.println("�������λ��Ϊ��"+m);
		System.out.println("�������λ����λΪ��"+m/100);
		System.out.println("�������λ��ʮλΪ��"+m%100/10);
		System.out.println("�������λ����λΪ��"+m%10);
	}

}

/*�ָ���λ��*/