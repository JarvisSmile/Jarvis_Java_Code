package com.hugeyurt.Thread;

class Share
{
    synchronized public void waitFun()
    {
        try
        {
            System.out.println("wait....");
            wait();// this.wait();
            System.out.println("OK....");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    synchronized public void goFun()
    {
        try
        {
            //notify();// this.notify();
            notifyAll();
            System.out.println("go....");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class WaitThread2 extends Thread
{

    private Share share;

    public WaitThread2(Share share)
    {
        this.share = share;
    }

    public void run()
    {
        share.waitFun();
    }
}

class GoThread2 extends Thread
{

    private Share share;

    public GoThread2(Share share)
    {
        this.share = share;
    }

    public void run()
    {
        share.goFun();
    }
}

public class WaitGoSynFun
{
    public static void main(String[] args)
    {
        Share share = new Share();

        new WaitThread2(share).start();
        new WaitThread2(share).start();
        new WaitThread2(share).start();
        new GoThread2(share).start();
//        new GoThread2(share).start();
//        new GoThread2(share).start();
    }
}
