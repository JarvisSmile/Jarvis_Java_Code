package com.hugeyurt.Queue;

public class ArrayQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<Integer> queue=new ArrayQueue<Integer>(3);
		for(int i=1;i<=9;i++)
		{
			queue.inQueue(i);
		}
		while(!queue.isEmpty())
		{
			System.out.print(queue.outQueue()+"   ");
		}
	}

}
