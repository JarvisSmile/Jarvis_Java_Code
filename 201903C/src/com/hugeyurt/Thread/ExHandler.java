package com.hugeyurt.Thread;

//�����Լ����쳣������
class MyExHandler implements Thread.UncaughtExceptionHandler
{
    // ʵ��uncaughtException�������÷����������̵߳�δ�����쳣
    public void uncaughtException(Thread t, Throwable e)
    {
        System.out.println("---> " + t + " �̳߳������쳣��" + e);
    }
}

class MyThread extends Thread
{
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        int a = 5 / 0;
    }
}
public class ExHandler
{
    public static void main(String[] args)
    {
        Thread th = new MyThread();
        th.setUncaughtExceptionHandler(new MyExHandler());
        th.start();
        
        // �������̵߳��쳣������
        //Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
        //int a = 5 / 0; // ��
        System.out.println("��������������");
    }
}
