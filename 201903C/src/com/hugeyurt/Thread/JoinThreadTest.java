package com.hugeyurt.Thread;

class JoinThread extends Thread
{
    // �ṩһ���в����Ĺ��������������ø��̵߳�����
    public JoinThread(String name)
    {
        super(name);
    }

    // ��дrun()�����������߳�ִ����
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(getName() + "  " + i);
        }
    }
}

class ThreadNew extends Thread
{
    private Thread th;
    ThreadNew(Thread th)
    {
        this.th = th;
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++)
        {
            System.out.println(getName() + "  " + i);
            if (10 == i) 
            {
                try
                {
                    th.join();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
public class JoinThreadTest
{

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
        // �������߳�
        //new JoinThread("���߳�").start();

        for (int i = 0; i < 100; i++)
        { 
            System.out.println(Thread.currentThread().getName() + "  " + i);
            
            if (i == 20)
            {
                JoinThread jt = new JoinThread("��Join���߳�");
                jt.start();
                // main�̵߳�����jt�̵߳�join()������main�߳�
                // �����jtִ�н����Ż�����ִ��
                jt.join();
                //new ThreadNew(jt).start();
            }
           
        }
    }
}
