package com.hugeyurt.Thread;

import java.util.concurrent.locks.*;

class WaitThread3 extends Thread
{

    private final ReentrantLock lock;
    private final Condition     cond;

    public WaitThread3(ReentrantLock lock, Condition cond)
    {
        this.lock = lock;
        this.cond = cond;
    }

    public void run()
    {
        lock.lock();
        try
        {
            System.out.println("wait....");
            cond.await();
            System.out.println("OK....");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }

    }
}

class GoThread3 extends Thread
{

    private final ReentrantLock lock;
    private final Condition     cond;

    public GoThread3(ReentrantLock lock, Condition cond)
    {
        this.lock = lock;
        this.cond = cond;
    }

    public void run()
    {
        lock.lock();
        try
        {
            cond.signalAll(); // cond.signal();
            System.out.println("go....");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }

    }
}

public class WaitGoLock
{
    public static void main(String[] args) throws InterruptedException
    {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();

        new WaitThread3(lock, cond).start();
        new WaitThread3(lock, cond).start();
        new WaitThread3(lock, cond).start();
        
        Thread.sleep(10);
        
        new GoThread3(lock, cond).start();
    }
}
