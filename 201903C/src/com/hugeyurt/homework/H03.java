package com.hugeyurt.homework;

import java.util.Arrays;
import java.util.Scanner;

public class H03 {
	/*1、有N乘N的二维矩阵，从左到右，从上到下，从右到左，从下到上，依次类推，把1-N平方个自然数，以上述蛇形赋值的方式进行赋值；*/
	public static int [][]Snake_array(int [][]a,int n) 
	{
		int k=1,i0,j0;
		a=new int[n][n];
		for (int i=0; i<=(n-1)/2;i++)//圈数
		{
			if (i == (n-1)/2)//如果是奇数，最后一个数字就是最中间的那个数字是n的平方
			{
				a[i][i] = n*n;
			}
			for (j0=i;j0<n-1-i;j0++)//上面从做往右，填充n-2*i-1个数字
			{
				a[i][j0] = k++;
			}
			for (i0=i;i0<n-1-i;i0++)//右边从上往下，填充n-2*i-1个数字
			{
				a[i0][j0] =k++;
			}
			for (;j0>i;j0--)//下边从有往左，填充n-2*i-1个数字
			{
				a[i0][j0] = k++;
			}
			for (;i0>i;i0--)//左边从上往下，填充n-2*i-1个数字
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
	/*2、输入一个字符串“hello   world”,输出”olleh   dlrow”;*/
	public static void Array(String s) 
	{
		String []p=s.split(" ");	
		System.out.println("源数据为："+s);
		System.out.print("结果数据为：");
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
	/*3、有N个人排成一队，从某人开始报数，1、2、3,报到3的人退出改圈，求最后一位是谁？*/
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
	/*4、求N个数的中位数*/
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
		System.out.print("数据为：{");
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
		System.out.print("输入数组行列数n=");
		int n=sc.nextInt();
		p=Snake_array(p,n);
		Print_Array(p);
		Array(a);
		System.out.println("------------------------------");
		System.out.print("请输入人数：n=");
		n=sc.nextInt();
		System.out.println("最后退出的是："+PeopleCircle(n)+"号");
		System.out.println("------------------------------");
		Print_Array(array);
		System.out.println("中位数为："+M_Num(array));
		System.out.println("------------------------------");
	}

}
