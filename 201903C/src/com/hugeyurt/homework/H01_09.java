package com.hugeyurt.homework;

public class H01_09 {
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
/*9.	��ӡ�����еġ�ˮ�ɻ���������ν��ˮ�ɻ�������ָһ����λ�������λ���������͵��ڸ��� �������磺153��һ����ˮ�ɻ���������Ϊ153=1�����η���5�����η���3�����η���*/