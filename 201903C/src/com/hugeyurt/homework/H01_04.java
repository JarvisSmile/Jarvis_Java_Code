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
				System.out.println(i+"������");
			}
		}
	}
}
/*4.	һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ��������������6=1��2��3.��� 
�ҳ�1000���ڵ���������
*/