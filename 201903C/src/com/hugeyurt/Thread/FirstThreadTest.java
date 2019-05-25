package com.hugeyurt.Thread;

//通过继承Thread类来创建线程类   Thread-0   Thread-1
class FirstThread extends Thread
{
    private int i;

    FirstThread()
    {
        
    }
    
    FirstThread(String name)
    {
        super(name);
    }
    
    // 重写run方法，run方法的方法体就是线程执行体
    public void run()
    {
        for (; i < 100; i++)
        {
            // 当线程类继承Thread类时，直接使用this即可获取当前线程
            // Thread对象的getName()返回当前该线程的名字
            // 因此可以直接调用getName()方法返回当前线程的名
            System.out.println(getName() + " " + i);
            
          //System.out.println(this.getName() + " " + i);
           //System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class FirstThreadTest
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
            // 调用Thread的currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20)
            {
                // 创建、并启动第一条线程
                new FirstThread().start();
                
                // 创建、并启动第二条线程
                new FirstThread().start();
                
                Thread th = new FirstThread();
                th.setName("Test");
                th.start();
                
                new FirstThread("Test_Main").start();
            }
        }
    }
}
