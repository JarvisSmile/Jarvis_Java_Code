package com.hugeyurt.Thread;

class SecondTask implements Runnable
{
    private int i;

    // run����ͬ�����߳�ִ����
    public void run()
    {
        for (; i < 100; i++)
        {
            // ���߳���ʵ��Runnable�ӿ�ʱ��
            // ������ȡ��ǰ�̣߳�ֻ����Thread.currentThread()������
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}

public class SecondThreadTest
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            if (i == 20)
            {
                SecondTask st = new SecondTask(); // ��
                // ͨ��new Thread(target , name)�����������߳�
                new Thread(st, "���߳�1").start();
                new Thread(st, "���߳�2").start();
            }
        }
    }

}
