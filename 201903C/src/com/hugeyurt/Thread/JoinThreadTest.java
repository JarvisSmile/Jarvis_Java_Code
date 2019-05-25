package com.hugeyurt.Thread;

class JoinThread extends Thread
{
    // 提供一个有参数的构造器，用于设置该线程的名字
    public JoinThread(String name)
    {
        super(name);
    }

    // 重写run()方法，定义线程执行体
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(getName() + "  " + i);
        }
    }
}

class ThreadNew extends Thread
{
    private Thread th;
    ThreadNew(Thread th)
    {
        this.th = th;
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++)
        {
            System.out.println(getName() + "  " + i);
            if (10 == i) 
            {
                try
                {
                    th.join();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
public class JoinThreadTest
{

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
        // 启动子线程
        //new JoinThread("新线程").start();

        for (int i = 0; i < 100; i++)
        { 
            System.out.println(Thread.currentThread().getName() + "  " + i);
            
            if (i == 20)
            {
                JoinThread jt = new JoinThread("被Join的线程");
                jt.start();
                // main线程调用了jt线程的join()方法，main线程
                // 必须等jt执行结束才会向下执行
                jt.join();
                //new ThreadNew(jt).start();
            }
           
        }
    }
}
