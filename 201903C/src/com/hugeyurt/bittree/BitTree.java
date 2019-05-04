package com.hugeyurt.bittree;

import java.util.Scanner;

public class BitTree {
	private int date;
	private BitTree lchild;
	private BitTree rchild;
	public BitTree(int data)
	{
		this.date=data;
		this.lchild=this.rchild=null;
	}
	public static BitTree creatBitTree(Scanner reader)
	{
		BitTree root =null;
		int m=reader.nextInt();
		if(m<=0)
			return null;
		root=new BitTree(m);
		root.lchild=creatBitTree(reader);
		root.rchild=creatBitTree(reader);
		return root;
	}
	public static void preVisited(BitTree root)
	{
		if(root==null) return ;
		System.out.print(" "+root.date);
		preVisited(root.lchild);
		preVisited(root.rchild);
	}
	public static void preVisited_Level(BitTree root)
	{
		
	}
}
