package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_03 {

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
/*3.	百分制转成等级制（ 利用 if   和  swtich  两种语句格式写）*/