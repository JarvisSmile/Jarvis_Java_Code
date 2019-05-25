package com.hugeyurt.Thread;
import java.util.concurrent.*;

class MyCallable implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception
    {
        // TODO Auto-generated method stub
        int i = 0;
        for (; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName()
                    + " 的循环变量i的值：" + i);
        }
        // call()方法可以有返回值
        return i;
    }
}

public class ThirdThreadTest
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        // 创建Callable对象
        // 先使用Lambda表达式创建Callable<Integer>对象
        // 使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>(new MyCallable());
        
        for (int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值："
                    + i);
            if (i == 20)
            {
                // 实质还是以Callable对象来创建、并启动线程
                new Thread(task, "有返回值的线程").start();
                System.out.println("子线程的返回值：" + task.get());
            }
        }
        
        try
        {
            // 获取线程返回值
            //System.out.println("子线程的返回值：" + task.get());
            //System.out.println("---------end---------");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
