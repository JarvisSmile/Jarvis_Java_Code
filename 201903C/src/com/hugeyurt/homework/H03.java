package com.hugeyurt.homework;

import java.util.Arrays;
import java.util.Scanner;

public class H03 {
	/*1����N��N�Ķ�ά���󣬴����ң����ϵ��£����ҵ��󣬴��µ��ϣ��������ƣ���1-Nƽ������Ȼ�������������θ�ֵ�ķ�ʽ���и�ֵ��*/
	public static int [][]Snake_array(int [][]a,int n) 
	{
		int k=1,i0,j0;
		a=new int[n][n];
		for (int i=0; i<=(n-1)/2;i++)//Ȧ��
		{
			if (i == (n-1)/2)//��������������һ�����־������м���Ǹ�������n��ƽ��
			{
				a[i][i] = n*n;
			}
			for (j0=i;j0<n-1-i;j0++)//����������ң����n-2*i-1������
			{
				a[i][j0] = k++;
			}
			for (i0=i;i0<n-1-i;i0++)//�ұߴ������£����n-2*i-1������
			{
				a[i0][j0] =k++;
			}
			for (;j0>i;j0--)//�±ߴ����������n-2*i-1������
			{
				a[i0][j0] = k++;
			}
			for (;i0>i;i0--)//��ߴ������£����n-2*i-1������
			{
				a[i0][j0] = k++;
			}
		}
		return a;
	}
	public static void Print_Array(int [][]p)
	{
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p[0].length;j++)
			{
				System.out.print(p[i][j]+"\t");
			}
			System.out.println(" ");
		}

		System.out.println("------------------------------");
	}
	/*2������һ���ַ�����hello   world��,�����olleh   dlrow��;*/
	public static void Array(String s) 
	{
		String []p=s.split(" ");	
		System.out.println("Դ����Ϊ��"+s);
		System.out.print("�������Ϊ��");
		char[] a1=p[0].toCharArray();
		for(int i=a1.length-1;i>=0;i--) 
		{
			System.out.print(a1[i]);
		}
		System.out.print(" ");
		char[] a2=p[1].toCharArray();
		for(int i=a2.length-1;i>=0;i--) 
		{
			System.out.print(a2[i]);
		}
		System.out.println("");
	}
	/*3����N�����ų�һ�ӣ���ĳ�˿�ʼ������1��2��3,����3�����˳���Ȧ�������һλ��˭��*/
	public static int PeopleCircle(int n)
	{
		int a[]=new int[n];
		int T=1;
		int count=0;
		int LastOne=0;
		int AllOfOut=0;
		while(T==1)
		{
			
			for(int i=0;i<n;i++)
			{
				if(a[i]==0) 
				{
					count++;
				}
				if(count==3) 
				{
					a[i]=1;
					LastOne=i+1;
					AllOfOut++;
					count=0;
				}
				if(AllOfOut==n)
				{
					T=0;
					break;
				}
			}
		}
		return LastOne;
	}
	/*4����N��������λ��*/
	public static double M_Num(int []array) {
		Arrays.sort(array);
		int len=array.length;
		if(len%2==0) 
		{
			return (array[len/2]+array[len/2+1])/2;
		}
		else
		{
			return array[len/2];
		}
	}	
	public static void Print_Array(int []p)
	{
		System.out.print("����Ϊ��{");
		for(int i=0;i<p.length;i++) 
		{
			System.out.print(p[i]+"  ");
		}
		System.out.println("}");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="Hello World";
		int []array= {0,1,3,5,7,9,2,4,6,8,10};
		int [][]p=null;
		Scanner sc= new Scanner(System.in);
		System.out.print("��������������n=");
		int n=sc.nextInt();
		p=Snake_array(p,n);
		Print_Array(p);
		Array(a);
		System.out.println("------------------------------");
		System.out.print("������������n=");
		n=sc.nextInt();
		System.out.println("����˳����ǣ�"+PeopleCircle(n)+"��");
		System.out.println("------------------------------");
		Print_Array(array);
		System.out.println("��λ��Ϊ��"+M_Num(array));
		System.out.println("------------------------------");
	}

}