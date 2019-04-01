package com.jarvis.base;
import java.util.Scanner;

public class test_24_2 {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		   double x=reader.nextDouble();
	        double b=1.0;
	        double sum=1.0;
	        int m=1;
	        int i=1;
	        do
	        {
	        	b=b*x/i;
	            if(i%2==0)
	            {
	        		m=-m;
	                sum+=m*b;
	            }
	        	i++;
	        }
	        while(b>=0.000001); 
	        System.out.print ("cos(x)="+sum);
	}
}
