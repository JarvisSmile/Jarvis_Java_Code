package com.jarvis.base;

import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class test_24_3 {

	public static int getMax(int[] arr)
	{
		int max = arr[0];//�������
		for (int x=1; x<arr.length; x++ )
		{
			if (arr[x]>max)
			{
				max = arr[x];
			}
		}
		return max;
	}	
	public static int getMin(int[] arr)
	{
		int min = arr[0];//�������
		for (int x=1; x<arr.length; x++ )
		{
			if (arr[x]<min)
			{
				min = arr[x];
			}
		}
		return min;
	}
	public static int getNo(int a,int []arr) {
		int n=0;
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i])
			{
				n=i;
				break;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int a[]=new int[10];
		Random random1 = new Random(10);
		//Scanner sc=new Scanner(System.in);
		System.out.print("����Ϊa={");
		for(int i=0;i<10;i++) {
			a[i]=Math.abs(random1.nextInt()%100);
			System.out.print(a[i]+"  ");
		}
		System.out.println("}");
		System.out.println("���Ϊa["+getNo(getMax(a),a)+"]:"+getMax(a));
		System.out.println("��СΪa["+getNo(getMin(a),a)+"]:"+getMin(a));
	}
}