package com.pan.base;

import java.util.Scanner;

public class Main {

	public static double factorial(double n) {
		double value=1;
		if(n==0)
			return value;
		else if (n>0){
			for(int i=1;i<=n;i++)
				value*=i;
			return value;
		}
		return 1;
	}
  public static double DX(double x,int n)
  {
    if(n%2==0)
      return -Math.pow(x,n)/factorial(n);
    else
      return Math.pow(x,n)/factorial(n);
  }

  public static void main(String []args)
  { 
	  Scanner sc=new Scanner(System.in);
	  double rx=0;
	  double x=sc.nextDouble();
	  for(int i=1;;i++)
	  {
		  if(Math.abs(DX(x,i))<0.0001)
		  {
			  break;
		  }
		  rx+=DX(x,i);
	  }
	  System.out.printf("%.2f",rx);
  }
}
