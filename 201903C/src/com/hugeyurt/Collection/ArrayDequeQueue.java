package com.hugeyurt.Collection;
import java.util.ArrayDeque;

public class ArrayDequeQueue
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ArrayDeque<String> queue = new ArrayDeque<String>();
        // ���ν�����Ԫ�ؼ������
        queue.offer("����");
        queue.offer("��ѧ");
        queue.offer("Ӣ��");
        // �����[����, ��ѧ, Ӣ��]
        System.out.println(queue);
        // ���ʶ���ͷ����Ԫ�أ�����������poll������"ջ"�����������
        System.out.println(queue.peek());
        
        // ��Ȼ�����[����, ��ѧ, Ӣ��]
        System.out.println(queue);
        
        // poll����һ��Ԫ�أ����������
        System.out.println(queue.poll());
        
        // �����[��ѧ, Ӣ��]
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
