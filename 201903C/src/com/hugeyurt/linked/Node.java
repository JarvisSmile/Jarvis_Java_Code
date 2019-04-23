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
		Node head=this.next;
		while(head!=null)
		{
			System.out.println(head.data);
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
		Node insertNode= new Node(num);
		Node p=null;
		Node q=null;
		Node head=null;
		p=q=head=this.next;
		if(num<head.data)
		{
			insertNode.next=head;
			this.next=insertNode;
		}
		else
		{
			while(p!=null&&p.data<num)
			{
				q=p;
				p=p.next;
			}
			insertNode.next=p;
			q.next=insertNode;
			this.next=head;
		}
	}
	public void deleteNode(int num)
	{
		Node p=null;
		Node q=null;
		Node head=null;
		p=q=head=this.next;
		if(num==head.data)
		{
			head=head.next;
		}
		else
		{
			while(p!=null)
			{
				if(p.data==num)
				{
					p=p.next;
					q.next=p;
				}
				else
				{
					q=p;
					p=p.next;
				}
			}
		}
		this.next=head;
	}
	public void ReverseLinked()
	{
		Node head=this.next;
		Node p=head;
		head=null;
		while(p!=null)
		{
			Node q=p.next;
			p.next=head;
			head=p;
			p=q;
		}
		this.next=head;
	}	
	public void ReverseLinked2()
	{
		Node head=this.next;
		this.next=null;
		Node tail=null;
		if(head==null||head.next==null)
			return ;
		while(true)
		{
			Node p=head;
			Node q=head;
			while(p.next!=null)
			{
				q=p.next;
				p=p.next;
			}
			q.next=null;
			if(this.next==null)
				this.next=tail=p;
			else
			{
				tail.next=p;
				tail=p;
			}
			if(tail==head)
				break;
		}
	}
}
