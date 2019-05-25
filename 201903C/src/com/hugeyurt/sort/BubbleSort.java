package com.hugeyurt.sort;

public class BubbleSort {
	public static int [] bubblesort(int []num)
	{
		int t=0;
		for(int i=1;i<=num.length;i++)
		{
			for(int j=0;j<num.length-i;j++)
			{
				
				if(num[j]>num[j+1])
				{
					t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
			}
		}
		return num;
	}
}
