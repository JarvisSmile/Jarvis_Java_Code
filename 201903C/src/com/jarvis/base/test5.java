package com.jarvis.base;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lr,jj=0;
		Scanner sc=new Scanner(System.in);
		lr=sc.nextDouble();
		if(lr<=10) {
			jj=lr*0.1;
		}
		else if(lr>10&&lr<=20) {
			jj=1+(lr-10)*0.075;
		}
		else if(lr>20&&lr<=40) {
			jj=1.75+(lr-20)*0.05;
		}
		else if(lr>40&&lr<=60) {
			jj=2.75+(lr-40)*0.03;
		}
		else if(lr>60&&lr<=100) {
			jj=3.35+(lr-60)*0.015;
		}
		else if(lr>100)
		{
			jj=3.95+(lr-100)*0.01;
		}
		System.out.print("����Ϊ"+lr+"\t������"+jj);
	}

}