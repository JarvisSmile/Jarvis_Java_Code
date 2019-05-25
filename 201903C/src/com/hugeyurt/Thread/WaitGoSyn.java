package com.hugeyurt.Thread;

class WaitThread extends Thread
{
    private Object obj;

    public WaitThread(Object obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        synchronized (obj)
        {
            try
            {
                System.out.println("wait....");
                obj.wait();
                System.out.println("OK....");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

class GoThread extends Thread
{

    private Object obj;

    public GoThread(Object obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        synchronized (obj)
        {
            try
            {
                obj.notifyAll(); //
                //obj.notify();
                System.out.println("go....");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class WaitGoSyn
{
    public static void main(String[] args)
    {
        Object obj = new Object();
       
        new WaitThread(obj).start();
        new WaitThread(obj).start();
        new WaitThread(obj).start();
        new GoThread(obj).start();
//        new GoThread(obj).start();
//        new GoThread(obj).start();
    }
}

