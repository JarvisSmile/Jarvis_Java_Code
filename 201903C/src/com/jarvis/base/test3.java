package com.jarvis.base;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int _grade;
		_grade=sc.nextInt();
		if(_grade>90)
		{
			System.out.print("A");
		}
		else if(_grade>80&&_grade<=90)
		{
			System.out.print("B");
		}
		else if(_grade>70&&_grade<=80)
		{
			System.out.print("C");
		}
		else if(_grade>=60&&_grade<=70)
		{
			System.out.print("D");
		}
		else
		{
			System.out.print("F");
		}	
	}
}
