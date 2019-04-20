package com.hugeyurt.linked;

import java.util.Scanner;

public class Node {
	private int data;
	private Node next;
	public Node() 
	{
		this.data=0;
		this.next=null;
	}
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public static Node CreatLinkedByHead(Scanner reader)
	{
		Node head=null;
		int m=reader.nextInt();
		while(m>0) {
			Node p=new Node(m);
			p.next=head;
			head=p;
			m=reader.nextInt();
		}
		return head;
	}
	public static void printLinked(Node head) 
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next ;
		}
	}
	public void CreatLinkedByHead2(Scanner reader)
	{
		//=new Scanner(System.in);
		int m=reader.nextInt();
		while(m>0) {
			Node p=new Node(m);
			p.next=this.next;
			this.next=p;
			m=reader.nextInt();
		}
	}
	public void printLinked()
	{
		Node head=this;
		while(head!=null)
		{
			System.out.print(head.data);
			head=head.next;
		}
	}

	public void CreateLinkedByTail(Scanner reader) {
	     Node head=null;
	     Node tail=null;
	     int m=reader.nextInt();
	     while(m>0)
	     {
	    	 Node p=new Node(m);
	    	  if(head==null) tail=head=p;
	    	  else{
	    		  tail.next=p;
	    		  tail=p;
	    	 }
	    	 m=reader.nextInt();
	     }
	     this.next=head;
	}
	public void insertANode(int num)
	{
		
	}
	public void deleteNode(int num)
	{
		
	}
}
