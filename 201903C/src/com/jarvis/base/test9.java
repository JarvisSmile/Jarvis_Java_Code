package com.jarvis.base;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  g,s,b,num;
		for(int i=100;i<1000;i++) {
			g=i%10;
			s=i%100/10;
			b=i/100;
			if(i==(g*g*g+s*s*s+b*b*b)) {
				System.out.println(i+"��һ��ˮ�ɻ�����");
			}
		}
	}

}