package com.jarvis.base;

import java.util.Scanner;

public class YMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a是日期b为二月份天数c为截至日期以前完整月的总天数，ymd分别表示年月日*/
		int a,b,c = 0,y,m,d;
		/*输入格式为八位表示，如20180101*/
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		/*拆分年月日*/
		y=a/10000;
		m=a%10000/100;
		d=a%100;
		/*判断是否闰年*/
		if(y%4==0&&y%100!=0||y%400==0) {
			b=29;
		}
		else {
			b=28;
		}
		switch(m) {
		  case 1:
			  c=0;
			  break;
		  case 2:
			  c=31;
			  break;
		  case 3:
			  c=31+b;
			  break;
		  case 4:
			  c=31+b+31;
			  break;
		  case 5:
			  c=31+b+31+30;
			  break;
		  case 6:
			  c=31+b+31+30+31;
			  break;
		  case 7:
			  c=31+b+31+30+31+30;
			  break;
		  case 8:
			  c=31+b+31+30+31+30+31;
			  break;
		  case 9:
			  c=31+b+31+30+31+30+31+31;
			  break;
		  case 10:
			  c=31+b+31+30+31+30+31+31+30;
			  break;
		  case 11:
			  c=31+b+31+30+31+30+31+31+30+31;
			  break;
		  case 12:
			  c=31+b+31+30+31+30+31+31+30+31+30;
			  break;
		}
		
		System.out.println(c);
		
		System.out.println(c+d);
	}

}
