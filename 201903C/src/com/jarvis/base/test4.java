package com.jarvis.base;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=5;i<1000;i++) {
			int value=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					value+=j;
				}
			}
			if(i==value) {
				System.out.println(i+"������");
			}
		}
	}

}