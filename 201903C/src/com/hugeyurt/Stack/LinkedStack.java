package com.hugeyurt.Stack;
class Node<T>
{
	T data;
	Node next;
	public Node(T data)
	{
		this.data=data;
		this.next=null;
	}
}

public class LinkedStack<T> 
{
	private Node<T> top;
	
	public LinkedStack()
	{
		this.top=null;
	}
	public boolean push(T num)
	{
		Node p=new Node(num);
		p.next=this.top;
		this.top=p;
		return true;
	}
	
	public  T pop()
	{
	  if(this.top==null) return null;
	  T num=this.top.data;
	  this.top=this.top.next;
	  return num;
	}
	
	public  T top()
	{
		if(this.top==null) return null;
		  T num=this.top.data;
		 // this.top=this.top.next;
		  return num;
	}
	
	public boolean isEmpty()
	{
		return this.top==null;
	}
	
	
	
	
}
