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
				System.out.println(i+"������");
			}
		}
	}

}
/*6.	����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž���������*/