package com.hugeyurt.Stack;

public class ArrayStack2
{
	private Object  data[];
	private int top;
	
	public ArrayStack2()
	{
	    this.data=new Object[10];
		this.top=-1;
	}
	
	public ArrayStack2(int size)
	{
		this.data=new Object[size];
		this.top=-1;
	}
	
	public boolean push(Object num)
	{
		if(this.top==this.data.length-1) return false;
		this.top++;
		this.data[this.top]=num;
		return true;
	}
	
	public  Object pop()
	{
	  if(this.top==-1) return null;
	  return this.data[this.top--];
	}
	
	public  Object top()
	{
	  if(this.top==-1) return null;
	  return this.data[this.top];
	}
	
	public boolean isEmpty()
	{
		return this.top==-1;
	}
	
	public boolean isFull()
	{
		return this.data.length-1==this.top;
	}
	
	

}
