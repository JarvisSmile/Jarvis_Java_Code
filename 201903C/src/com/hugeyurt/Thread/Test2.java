package com.hugeyurt.Thread;

class OddEvenTask implements Runnable
{
    private int start;
    private int end;
    
    OddEvenTask(int start, int end)
    {
        this.start = start;
        this.end   = end;
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (int i = start; i <= end; i+=2)
        {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

public class Test2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
//        Runnable task1 = new OddEvenTask(0, 100);
//        Runnable task2 = new OddEvenTask(1, 100);
//        new Thread(task1, "偶数").start();
//        new Thread(task2, "奇数").start();
        
          new Thread(new OddEvenTask(0, 100), "偶数").start();
          new Thread(new OddEvenTask(1, 100), "奇数").start();      
    }

}
