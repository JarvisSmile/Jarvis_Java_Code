package com.hugeyurt.homework;

import java.util.Scanner;

public class H01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int j=1;j<10;j++) {
			int a=1,b=j,m=j,s=0;
//a表示现在是第几位，b表示当前重复数值，m表示当前叠加的数，s求和
			System.out.print("s="+m);
			for(int i=1;i<((num-1)%9+1);i++) {
				s+=m;
				a*=10;
				m+=b*a;
				System.out.print("+"+m);
			}
			s+=m;
			System.out.println("="+s);
		}

	}

}
/*10.	求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时 共有5个数相加)，几个数（最多输入9个，大于9取9的模）相加有键盘控制。*/