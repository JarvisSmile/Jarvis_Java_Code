package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_05 {

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
		System.out.print("利润为"+lr+"\t奖金是"+jj);
	}

}
/*
 * 5.	企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时，高于40万元的部，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%；
 */