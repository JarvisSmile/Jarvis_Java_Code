package com.hugeyurt.Thread;

import java.util.concurrent.*;

class MyRun implements Runnable
{
    int No;
    public MyRun(int No)
    {
        this.No = No;
    }
    
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "No:" + No
                    + "��iֵΪ:" + i);
        }
    }
}

public class ThreadPoolTest
{
    public static void main(String[] args)
        throws Exception
    {
        // �����㹻���߳���֧��4��CPU���е��̳߳�
        // ����һ�����й̶��߳�����5�����̳߳�
        ExecutorService pool = Executors.newFixedThreadPool(1);
        //ExecutorService pool = Executors.newFixedThreadPool(1);
        // ʹ��Lambda���ʽ����Runnable����

        pool.submit(new MyRun(1));
        pool.submit(new MyRun(2));
        pool.submit(new MyRun(3));

        // �ر��̳߳�
        //pool.shutdown(); 
        pool.shutdownNow();
    }
}

