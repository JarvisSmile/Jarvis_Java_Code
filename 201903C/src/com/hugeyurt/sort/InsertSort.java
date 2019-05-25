package com.hugeyurt.sort;

public class InsertSort {
	public static int[] insertsort(int []num)
	{
		for(int i=1;i<num.length;i++) 
		{	int j;
			int t=num[i];
			for(j=0;j<i;j++)
				if(num[j]>t) break;
			for(int k=i;k<j;k++)
				num[k]=num[k-1];
			num[j]=t;
			for(int p=0;p<num.length;p++)
			{
				System.out.print(num[p]+"	");
			}
			System.out.println();
        }
		return num;
	}
}
