package com.hugeyurt.Bit;

import java.util.Scanner;

public class App2 {

	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a > 0){
			System.out.print(0);
		}
		else{
			System.out.print(1);
		}
		for(int i=30; i>=0; --i)
		{
			System.out.print( bit_on(a, i) );
		}
	}
	public static int bit_on(int a, int pos)
	{
		int t=1<<pos;
		int p=( a & t );
		if( p > 0 )
			return 1;
		return 0;
	}
}
