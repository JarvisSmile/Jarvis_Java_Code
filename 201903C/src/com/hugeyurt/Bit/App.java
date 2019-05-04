package com.hugeyurt.Bit;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=a^b;
		int count = 0;
		if(ans==0)System.out.println("四个字节都相同");
		else
		{
			for(int i=0;i<4;i++)
			{
				if((ans&255)==0)
				{
					count++;
				}
				ans=ans>>8;
			}
		}
		System.out.println(count);
	}

}
