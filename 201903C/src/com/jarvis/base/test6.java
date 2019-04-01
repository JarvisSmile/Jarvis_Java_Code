package com.jarvis.base;

public class test6 {

	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++) {
			int a=0;
			for(int j=1;j<i;j++) {
				
				if(i%j==0) {	
					a+=j;
				}
			}
			if(a==i) {
				System.out.println(i+"ÊÇÍêÊý");
			}
		}
	}

}
