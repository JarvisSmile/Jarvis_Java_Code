package com.hugeyurt.Queue;

public class ArrayQueue <T>{
	private T[] data;
	private int head;
	private int tail;
	private int count;
	public ArrayQueue()
	{
		this.data=(T[])new Object[10];
		this.head=this.tail=this.count=0;
	}
	public ArrayQueue(int length)
	{
		this.data=(T[])new Object[length];
		this.head=this.tail=this.count=0;
	}
	public boolean inQueue(T num)
	{
		if(this.count==this.data.length)
		{
			//ÄÚ´æÀ©Èİ
			T [] tem=(T[])new Object[2*this.data.length];
			for(int i=0;i<this.count;i++)
			{
				this.head=(this.head+1)%this.data.length;
				tem[i]=this.data[this.head];
			}
			this.head=-1;
			this.tail=this.count-1;
			this.data=tem;
		}
		this.tail=(this.tail+1)%this.data.length;
		this.data[this.tail]=num;
		this.count++;
		return true;
	}
	public T outQueue()
	{
		if(this.count==0)
			return null;
		this.head=(this.head+1)%this.data.length;
		this.count--;
		return this.data[this.head];
	}
	public boolean isEmpty()
	{
		return this.count==0;
	}
	public boolean isFull()
	{
		return this.count==this.data.length;
	}
}
