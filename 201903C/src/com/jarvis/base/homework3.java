package com.jarvis.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class homework3 {
	public static void Array(String s) {
		String []p=s.split(" ");	
		char[] a1=p[0].toCharArray();
		for(int i=a1.length-1;i>=0;i--) {
			System.out.print(a1[i]);
		}

		System.out.print(" ");
		char[] a2=p[1].toCharArray();
		for(int i=a2.length-1;i>=0;i--) {
			System.out.print(a2[i]);
		}
	}
	public static void Snake_array(int []a) {
		int n=a.length;
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello World";
		int []array= {0,1,3,5,7,9,2,4,6,8,10};
		System.out.print(M_Num(array));
	}

}
