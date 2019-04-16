package com.hugeyurt.homework;

public class H01_04 {
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
				System.out.println(i+"是完数");
			}
		}
	}
}
/*4.	一个数如果恰好等于它的因子之和，这个数就称为“完数”。例如6=1＋2＋3.编程 
找出1000以内的所有完数
*/