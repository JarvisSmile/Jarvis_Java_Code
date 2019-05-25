package com.hugeyurt.Collection;
import java.util.ArrayDeque;

public class ArrayDequeQueue
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ArrayDeque<String> queue = new ArrayDeque<String>();
        // 依次将三个元素加入队列
        queue.offer("语文");
        queue.offer("数学");
        queue.offer("英语");
        // 输出：[语文, 数学, 英语]
        System.out.println(queue);
        // 访问队列头部的元素，但并不将其poll出队列"栈"，输出：语文
        System.out.println(queue.peek());
        
        // 依然输出：[语文, 数学, 英语]
        System.out.println(queue);
        
        // poll出第一个元素，输出：语文
        System.out.println(queue.poll());
        
        // 输出：[数学, 英语]
        System.out.println(queue);
        
        queue.offerFirst("abc");
        queue.offerLast("123");
        
        System.out.println(queue);
        
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());
        System.out.println(queue);
        
        queue.push("123");
        System.out.println(queue);
        
    }

}
