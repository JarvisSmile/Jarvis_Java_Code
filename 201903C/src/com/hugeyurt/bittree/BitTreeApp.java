package com.hugeyurt.bittree;
import java.util.Scanner;

public class BitTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BitTree root=BitTree.creatBitTree(sc);
		BitTree.preVisited(root);
	}

}
