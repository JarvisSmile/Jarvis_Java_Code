package com.hugeyurt.homework;

import java.util.Scanner;

public class H05_01 {
/*通过键盘输入10个int类型数据，将数据存储到一个一维数组里，
 * 自行设计一个排序方法对该一维数组完成排序过程，并将排序结果输出。
 * （要求：不指定排序算法，但是要说明自己设计的排序过程是升序还是降
 * 序过程，否则即便算法完成也要扣5分） （14分）*/
	public static int []sortA(int []a){

		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		a=sortA(a);
		for (int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}

}
