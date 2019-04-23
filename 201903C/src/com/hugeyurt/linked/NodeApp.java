package com.hugeyurt.linked;

import java.util.Scanner;

public class NodeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Node head=Node.CreateLinkedByTail(sc);
//		Node.printLinked(head);
		Node head=new Node();
		//head.CreatLinkedByHead2(sc);
		head.CreateLinkedByTail(sc);
		head.printLinked();
		head.insertANode(6);
		head.printLinked();
		head.deleteNode(9);
		head.printLinked();
		head.ReverseLinked();
		head.printLinked();
	}

}
