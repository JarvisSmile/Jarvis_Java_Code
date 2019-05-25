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
                    + "的i值为:" + i);
        }
    }
}

public class ThreadPoolTest
{
    public static void main(String[] args)
        throws Exception
    {
        // 创建足够的线程来支持4个CPU并行的线程池
        // 创建一个具有固定线程数（5）的线程池
        ExecutorService pool = Executors.newFixedThreadPool(1);
        //ExecutorService pool = Executors.newFixedThreadPool(1);
        // 使用Lambda表达式创建Runnable对象

        pool.submit(new MyRun(1));
        pool.submit(new MyRun(2));
        pool.submit(new MyRun(3));

        // 关闭线程池
        //pool.shutdown(); 
        pool.shutdownNow();
    }
}

