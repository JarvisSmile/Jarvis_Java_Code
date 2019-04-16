package com.hugeyurt.homework;

public class H01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<1000;i++) {
			int a=0;
			for(int j=1;j<i;j++) {
				
				if(i%j==0) {	
					a+=j;
				}
			}
			if(a==i) {
				System.out.println(i+"是完数");
			}
		}
	}

}
/*6.	高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？*/