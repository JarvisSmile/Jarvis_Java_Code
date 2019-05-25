package com.hugeyurt.sort;

public class SelectionSort {
	public static int[] SelectionSort(int []c)
	{
		int t=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					t=c[j];
					c[j]=c[i];
					c[i]=t;
				}
			}
		}
		return c;
	}
}
