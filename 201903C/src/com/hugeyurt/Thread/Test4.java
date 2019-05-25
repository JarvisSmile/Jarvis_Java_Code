package com.hugeyurt.Thread;

class SumThread extends Thread
{
    private int start;
    private int end;
    private int sum;
    
    SumThread(int start, int end)
    {
        this.start = start;
        this.end   = end;
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (int i = start; i <= end; i+=1)
        {
            sum += i;
        } 
        System.out.println(Thread.currentThread().getName() + " -> " + sum);
    }   
    
    int getSum()
    {
        return sum;
    }
}


class SumTask implements Runnable
{
    private int start;
    private int end;
    private int sum;
    
    SumTask(int start, int end)
    {
        this.start = start;
        this.end   = end;
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (int i = start; i <= end; i+=1)
        {
            sum += i;
        } 
        System.out.println(Thread.currentThread().getName() + " -> " + sum);
    }   
    
    int getSum()
    {
        return sum;
    }
}

public class Test4
{

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
//        SumThread[] sts = new SumThread[10];
//        for (int i = 0; i < sts.length; ++i)
//        {
//            sts[i] = new SumThread(i * 10 + 1, i * 10 + 10);
//            sts[i].start();
//        }
//        
//        int sum = 0;
//        for (SumThread st : sts)
//        {
//            st.join();
//            sum += st.getSum();
//        }
//        System.out.println(sum);
        
        
        Thread[] ths = new Thread[10];
        SumTask[] sts = new SumTask[10];
        for (int i = 0; i < sts.length; ++i)
        {
            sts[i] = new SumTask(i * 10 + 1, i * 10 + 10);
            ths[i] = new Thread(sts[i]);
            ths[i].start();
        }
        
        int sum = 0;
        for (int i = 0; i < sts.length; ++i)
        {
            ths[i].join();
            sum += sts[i].getSum();
        }
        System.out.println(sum);
    }

}
