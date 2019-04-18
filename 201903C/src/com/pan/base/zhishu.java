package com.pan.base;

public class zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isZ=1;
		int count=0;
		for(int i=101;i<999;i++)
		{
			if(i==997)
			{
				System.out.print(i+"\n");
				break;
			}
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					isZ=0;
					break;
				}
			}
			if(isZ==1)
			{
				System.out.print("   "+i);
				count++;
				if(count%5==0)
				{
					System.out.println();
				}
			}
			else
			{
				isZ=1;
			}
		}
	}

}
