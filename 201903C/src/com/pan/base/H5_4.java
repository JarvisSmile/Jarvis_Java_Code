package com.pan.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class H5_4 {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer []a=new Integer [n];
		Integer sum=0;
		Integer count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Integer Max=(Integer) Collections.max(Arrays.asList(a));
		Integer Min=(Integer) Collections.min(Arrays.asList(a));
		for(int i=0;i<n;i++)
		{
			if(a[i]!=Max&&a[i]!=Min)
			{
				sum += a[i];
				count++;
			}
			
		}
		System.out.printf("max element:%d\n", Max);
		System.out.printf("min element:%d\n", Min);
		if(count>0)
			System.out.printf("average is %5.2f\n",(double)sum/count);
		else
			System.out.print("no solution\n");
	}
}
