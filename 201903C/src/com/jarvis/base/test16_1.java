package com.jarvis.base;

public class test16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value=0;
		for(double i=1;i<=100;i++) {
			if(i%2==0) {
				value+=(-1)/i;
			}
			else {
				value+=1/i;
			}
		}
		System.out.println(value);
	}
}