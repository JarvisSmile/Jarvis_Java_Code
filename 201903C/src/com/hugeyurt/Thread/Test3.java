package com.hugeyurt.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class OddEvenCall implements Callable<Integer>
{
    private int start;
    private int end;
    
    OddEvenCall(int start, int end)
    {
        this.start = start;
        this.end   = end;
    }
   
    @Override
    public Integer call() throws Exception
    {
        // TODO Auto-generated method stub
        for (int i = start; i <= end; i+=2)
        {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }        
        return null;
    }
}


class SumCall implements Callable<Integer>
{
    private int start;
    private int end;
    
    SumCall(int start, int end)
    {
        this.start = start;
        this.end   = end;
    }
   
    @Override
    public Integer call() throws Exception
    {
        // TODO Auto-generated method stub
        int sum = 0;
        for (int i = start; i <= end; i+=1)
        {
            sum += i;
        } 
        System.out.println(Thread.currentThread().getName() + " -> " + sum);
        
        return sum;
    }
}

public class Test3
{

    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        // TODO Auto-generated method stub
//        FutureTask<Integer> fu1 = new FutureTask<Integer>(new OddEvenCall(0, 100));
//        FutureTask<Integer> fu2 = new FutureTask<Integer>(new OddEvenCall(1, 100));
//        new Thread(fu1, "Å¼Êý").start(); 
//        new Thread(fu2, "ÆæÊý").start();  
        //fu1.get();
        //fu2.get();
        
        FutureTask<Integer>[] fus = new FutureTask[10];
        //Thread[] ths = new Thread[10];
        
        for (int i = 0; i < fus.length; ++i)
        {
            fus[i] = new FutureTask<Integer>(new SumCall(i * 10 + 1, i * 10 + 10));
            //ths[i] = new Thread(fus[i]);
            //ths[i].start();
            new Thread(fus[i]).start();
        }
        
        int sum = 0;
        for (int i = 0; i < fus.length; ++i)
        {
            sum += fus[i].get();
        }
        System.out.println(sum);
    }

}
