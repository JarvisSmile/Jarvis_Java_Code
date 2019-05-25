package com.hugeyurt.Thread;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyRun2 implements Runnable
{
    int No;

    public MyRun2(int No)
    {
        this.No = No;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "No:" + No
                    + "µÄiÖµÎª:" + i);
        }
    }
}

class MyFixThreadPool
{
    private boolean     bDown    = false;
    private boolean     bDownNow = false;

    ArrayList<Runnable> list     = new ArrayList<Runnable>();
    final ReentrantLock lock     = new ReentrantLock();
    final Condition     cond     = lock.newCondition();

    class MyThread extends Thread
    {
        public MyThread(String name)
        {
            super(name);
        }

        public void run()
        {
            while (true)
            {
                Runnable run = null;
                lock.lock();
                if (!list.isEmpty())
                {
                    run = list.get(0);
                    list.remove(0);
                }
                else
                {
                    try
                    {
                        if (bDown)
                        {
                            lock.unlock();
                            break;
                        }
                        cond.await();
                        lock.unlock();
                        continue;
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                lock.unlock();

                if (run != null)
                {
                    run.run();
                }
                if (bDownNow)
                    break;
            }
        }
    }

    public MyFixThreadPool(int maxThread)
    {
        for (int i = 0; i < maxThread; ++i)
        {
            String name = "thread-" + i;
            new MyThread(name).start();
        }
    }

    public void submit(Runnable run)
    {
        lock.lock();
        list.add(run);
        cond.signal();
        lock.unlock();
    }

    public void shutDown()
    {
        lock.lock();
        bDown = true;
        cond.signal();
        lock.unlock();
    }

    public void shutDownNow()
    {
        lock.lock();
        bDownNow = true;
        cond.signal();
        lock.unlock();
    }
}

public class MyThreadPool2
{
    public static void main(String[] args) throws Exception
    {
        MyFixThreadPool pool = new MyFixThreadPool(1);

        pool.submit(new MyRun2(1));
        pool.submit(new MyRun2(2));
        pool.submit(new MyRun2(3));
         

        pool.shutDown();
    }
}
