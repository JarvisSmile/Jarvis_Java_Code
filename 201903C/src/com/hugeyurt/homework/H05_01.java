package com.hugeyurt.homework;

import java.util.Scanner;

public class H05_01 {
/*ͨ����������10��int�������ݣ������ݴ洢��һ��һά�����
 * �������һ�����򷽷��Ը�һά�������������̣����������������
 * ��Ҫ�󣺲�ָ�������㷨������Ҫ˵���Լ���Ƶ���������������ǽ�
 * ����̣����򼴱��㷨���ҲҪ��5�֣� ��14�֣�*/
	public static int []sortA(int []a){

		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		a=sortA(a);
		for (int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}

}
