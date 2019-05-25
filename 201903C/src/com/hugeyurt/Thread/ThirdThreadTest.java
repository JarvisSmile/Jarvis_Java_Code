package com.hugeyurt.Thread;
import java.util.concurrent.*;

class MyCallable implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception
    {
        // TODO Auto-generated method stub
        int i = 0;
        for (; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName()
                    + " ��ѭ������i��ֵ��" + i);
        }
        // call()���������з���ֵ
        return i;
    }
}

public class ThirdThreadTest
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        // ����Callable����
        // ��ʹ��Lambda���ʽ����Callable<Integer>����
        // ʹ��FutureTask����װCallable����
        FutureTask<Integer> task = new FutureTask<Integer>(new MyCallable());
        
        for (int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ��"
                    + i);
            if (i == 20)
            {
                // ʵ�ʻ�����Callable�������������������߳�
                new Thread(task, "�з���ֵ���߳�").start();
                System.out.println("���̵߳ķ���ֵ��" + task.get());
            }
        }
        
        try
        {
            // ��ȡ�̷߳���ֵ
            //System.out.println("���̵߳ķ���ֵ��" + task.get());
            //System.out.println("---------end---------");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
