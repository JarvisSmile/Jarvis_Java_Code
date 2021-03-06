package com.jarvis.base;

public class homework2 {
	public static int ArrayToInteger(String s) {
		int IntReturn=0;
		IntReturn = Integer.valueOf(s).intValue();
		return IntReturn;
	}	
	public static double ArrayToDouble(String s) {
		double DouReturn=0.0;
		DouReturn = Double.valueOf(s).doubleValue();
		return DouReturn;
		
	}
	public static char[] IntegerToArray(int number) {
		char []arr= {};
		String s ="";
		s=Integer.toString(number).toString();
		arr=s.toCharArray();
		return arr;
	}
	public static char[] DoubleToArray(double number) {
		char []arr= {};
		String s ="";
		s=Double.toString(number).toString();
		arr=s.toCharArray();
		return arr;
	}
	//字符串逆置
	public static char[] TurnArray(char []arr) {
		char []array= new char [arr.length];
		for(int i=0;i<arr.length;i++) {
			array[arr.length-1-i]=arr[i];
		}
		arr=array;
		return arr;
	}
	//矩阵转置
	public static char[][] MatrixTransposition(char [][] arr){
		for	(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				char temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		return arr;
	}
	//矩阵鞍点
	/*对于一个二维数组，鞍点就是二维数组中的一个元素，同时满足在该列上的最大值，在该行上的最小值。*/
	public static int[][] FindSaddlePoint(int [][] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(IsMax(arr,j,arr[i][j])&&IsMin(arr,i,arr[i][j])) {
					System.out.println("鞍点为：["+i+","+j+"]");
				}
			}
		}
		return arr;
	}	
	public static boolean IsMax(int [][]arr,int column,int point) {
		int p=point;
		for(int i=0;i<arr.length;i++) {
			if(p<arr[i][column]) {
				return false;
			}
		}
		return true;
	}	
	public static boolean IsMin(int [][]arr,int row,int point) {
		int p=point;
		for(int i=0;i<arr[row].length;i++) {
			if(p>arr[row][i]) {
				return false;
			}
		}
		return true;
	}
	//矩阵相乘
	public static int[][] MatrixMultiplication(int [][] arr1,int [][] arr2){
		 int[][]array= new int [arr1.length][arr2[0].length];
		//矩阵相乘的条件之一，矩阵1的列数等于矩阵2的行数
		if(arr1[0].length!=arr2.length) {
			System.out.println("这两个数组不能相乘");
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				for(int m=0;m<arr2.length;m++) {
					array[i][j]+=arr1[i][m]*arr2[m][j];
				}
			}
		}
		return array;
	}
	//输出字符型数组
	public static void PrintMatrix(char [][]arr) {
		for	(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");				
			}
			System.out.println();
		}
		return ;
	}
	//输出整形数组
	public static void PrintMatrix2(int [][]arr) {
		for	(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");				
			}
			System.out.println();
		}
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123";
		String s2="123.123";
		int num1=123456;
		double num2=123.456;
		char []arr= {'1','2','3','4'};
		char [][]arr1= {{'1','2','3',},{'4','5','6',},{'7','8','9',}};
		int [][]arr2=new int[][]{{1,2,4,3},{4,7,10,6},{2,6,20,7}};
		int[][] arr3={{5,-8},{-4,-7}};
        int[][] arr4={{5,-10,-4},{-7,-1,6}};
		System.out.println("------------------------------------");
		System.out.println("字符串转整形数：\t"+ArrayToInteger(s1)+1);
		System.out.println("------------------------------------");
		System.out.println("字符串转浮点数：\t"+ArrayToDouble(s2)+0.1);
		System.out.println("------------------------------------");
		System.out.print("整形数转字符串：\t");System.out.println(IntegerToArray(num1));
		System.out.println("------------------------------------");
		System.out.print("浮点数转字符串：\t");System.out.println(DoubleToArray(num2));
		System.out.println("------------------------------------");
		System.out.print("字符串逆置：\t原字符串 ");System.out.print(arr);System.out.print("，逆置后 ");System.out.println(TurnArray(arr));
		System.out.println("------------------------------------");
		System.out.println("原始数组： ");PrintMatrix(arr1);
		MatrixTransposition(arr1);
		System.out.println("转置数组： ");PrintMatrix(arr1);
		System.out.println("------------------------------------");
		System.out.println("原始数组： ");PrintMatrix2(arr2);
		FindSaddlePoint(arr2);
		System.out.println("------------------------------------");
		System.out.println("原始数组1： ");PrintMatrix2(arr3);System.out.println("原始数组2： ");PrintMatrix2(arr4);
		System.out.println("运算后：");PrintMatrix2(MatrixMultiplication(arr3,arr4));
	}

}
