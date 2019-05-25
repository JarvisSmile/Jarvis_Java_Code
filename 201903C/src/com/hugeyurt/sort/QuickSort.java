package com.hugeyurt.sort;

public class QuickSort {
	private static void swap(int []num,int l,int r)
	{
		if(l==r) return ;
		int t=num[l];
		num[l]=num[r];
		num[r]=t;
	}
	private static int Partition(int []num,int Low,int Hight)
	{
		if(num==null) return 0;
		int l=Low;
		int h=Hight+1;
		int center=num[Low];
		do
		{
			do
				l++;
			while(center>num[l]);
			do
				h--;
			while(center<num[h]);
			if(l<h)
			{
				swap(num,l,h);
			}
		}while(l<h);
		swap(num,Low,h);
		return h;
	}
	public static int[]quicksort(int []num,int Low,int Hight)
	{
		for(int n:num)
			System.out.print(n+"  ");;
		System.out.println();
		int k;
		if(Low<Hight)
		{
			k=Partition(num,Low,Hight);
			quicksort(num,Low,k-1);
			quicksort(num,k+1,Hight);
		}
		return num;
	}
}
