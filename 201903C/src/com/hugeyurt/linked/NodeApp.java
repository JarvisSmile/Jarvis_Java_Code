package com.hugeyurt.linked;

import java.util.Scanner;

public class NodeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Node head=Node.CreatLinkedByTail(sc);
//		Node.printLinked(head);
		Node head=new Node();
		//head.CreatLinkedByHead2(sc);
		head.CreateLinkedByTail(sc);
		head.printLinked();
	}

}
