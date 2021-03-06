package com.jarvis.base;
/*日历*/
import java.util.Scanner;
//firstday是第一天在周几
public class test_24_7 {
	public static int isYear(int y) {
		if(y%4==0&&y%100!=0||y%400==0) 
			return 1;
		return 0;
	}
	public static void YearShow(int y) {
		
		int firstday=0,a[]= {0,31,28+isYear(y),31,30,31,30,31,31,30,31,30,31},count;
		for (int i=1990;i<y;i++) {
			if(i%4==0&&i%100!=0||i%400==0) 
				firstday+=366;
			else
				firstday+=365;
		}
		for(int i=1;i<((firstday)%7+1);i++) {
			System.out.print("*\t");
		}

		count=((firstday)%7+1)-1;
		for(int m=1;m<13;m++) {
			for(int i=1;i<=a[m];i++)
			{
				if(count%7==0) {

					System.out.println("");
				}
				count++;
				System.out.print(i+"\t");
			}
		}
	}
	public static void MonthShow(int y,int m,int d) {
		int firstday=0,a[]= {0,31,28+isYear(y),31,30,31,30,31,31,30,31,30,31},count;
		/*由于week(y,m,d)返回结果是原结果+1所以先-1
		 * 先算第一个月是周几，从哪里开始*/
		
		firstday=Math.abs(week(y,m,d)-1-d)%7+1;
		for(int i=1;i<firstday;i++) {
			System.out.print("*\t");
		}
		count=firstday-1;
		for(int i=1;i<=a[m];i++)
		{
			if(count%7==0) {

				System.out.println("");
			}
			count++;
			System.out.print(i+"\t");
		}
	}
	public static int week(int y,int m,int d) { 
		int allday=0,i;
		for (i=1990;i<y;i++) {
			if(i%4==0&&i%100!=0||i%400==0) 
				allday+=366;
			else
				allday+=365;
		}
		allday+=currentofDay2(y,m,d);
		
		return (allday-1)%7+1;
	}
	public static int currentofDay(int y,int m,int d) {
		/*b用来表示二月份天数，fullMonthDay是表示这个月之前所有月份的总天数，ymd分别表示年月日*/
		int b=28,fullMonthDay = 0;
		/*判断是否闰年*/
		if(y%4==0&&y%100!=0||y%400==0) 
			b=29;
		switch(m) {
		  case 1:
			  fullMonthDay=0;			  break;
		  case 2:
			  fullMonthDay=31;			    break;
		  case 3:
			  fullMonthDay=31+b;			  break;
		  case 4:
			  fullMonthDay=31+b+31;			    break;
		  case 5:
			  fullMonthDay=31+b+31+30;			   break;
		  case 6:
			  fullMonthDay=31+b+31+30+31;			  break;
		  case 7:
			  fullMonthDay=31+b+31+30+31+30;			 break;
		  case 8:
			  fullMonthDay=31+b+31+30+31+30+31;			  	break;
		  case 9:
			  fullMonthDay=31+b+31+30+31+30+31+31;			  break;
		  case 10:
			  fullMonthDay=31+b+31+30+31+30+31+31+30;			 break;
		  case 11:
			  fullMonthDay=31+b+31+30+31+30+31+31+30+31;			break;
		  case 12:
			  fullMonthDay=31+b+31+30+31+30+31+31+30+31+30;			   break;
		}
		return fullMonthDay+d;
	}
	public static int currentofDay2(int y,int m,int d) {
		int monthday[]= {0,31,59,90,120,151,181,212,243,273,304,334,365};
		if(y%4==0&&y%100!=0||y%400==0) 
			return monthday[m-1]+d+1;
		return monthday[m-1]+d;
	}
	public static void main(String[] args) {
		/*输入格式为八位表示，如20180101*/
		int y,m,d;
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();
		MonthShow(y,m,d);
		YearShow(y);
		//System.out.println(week(y,m,d));
	}

}
