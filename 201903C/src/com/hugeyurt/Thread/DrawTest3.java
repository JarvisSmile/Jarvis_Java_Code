package com.hugeyurt.Thread;

import java.util.concurrent.locks.*;

//class Account
//{
//    // ��װ�˻���š��˻�����������Ա����
//    private String accountNo;
//    private double balance;
//    // ��ʶ�˻����Ƿ����д������
//    private boolean flag = false;
//
//    public Account(){}
//    // ������
//    public Account(String accountNo , double balance)
//    {
//        this.accountNo = accountNo;
//        this.balance = balance;
//    }
//
//    // accountNo��setter��getter����
//    public void setAccountNo(String accountNo)
//    {
//        this.accountNo = accountNo;
//    }
//    public String getAccountNo()
//    {
//        return this.accountNo;
//    }
//    // ����˻�����������޸ģ�����ֻΪbalance�ṩgetter������
//    public double getBalance()
//    {
//        return this.balance;
//    }
//
//    public synchronized void draw(double drawAmount)
//    {
//        try
//        {
//            // ���flagΪ�٣������˻��л�û���˴�Ǯ��ȥ��ȡǮ��������
//            if (!flag)
//            {
//                wait();
//            }
//            else
//            {
//                // ִ��ȡǮ
//                System.out.println(Thread.currentThread().getName()
//                    + " ȡǮ:" +  drawAmount);
//                balance -= drawAmount;
//                System.out.println("�˻����Ϊ��" + balance);
//                // ����ʶ�˻��Ƿ����д��������Ϊfalse��
//                flag = false;
//                // ���������߳�
//                notifyAll();
//            }
//        }
//        catch (InterruptedException ex)
//        {
//            ex.printStackTrace();
//        }
//    }
//    public synchronized void deposit(double depositAmount)
//    {
//        try
//        {
//            // ���flagΪ�棬�����˻��������˴�Ǯ��ȥ�����Ǯ��������
//            if (flag)             //��
//            {
//                wait();
//            }
//            else
//            {
//                // ִ�д��
//                System.out.println(Thread.currentThread().getName()
//                    + " ���:" +  depositAmount);
//                balance += depositAmount;
//                System.out.println("�˻����Ϊ��" + balance);
//                // ����ʾ�˻��Ƿ����д��������Ϊtrue
//                flag = true;
//                // ���������߳�
//                notifyAll();
//            }
//        }
//        catch (InterruptedException ex)
//        {
//            ex.printStackTrace();
//        }
//    }
//}

class Account4
{
    // ��ʽ����Lock����
    private final Lock      lock = new ReentrantLock();
    // ���ָ��Lock�����Ӧ��Condition
    private final Condition cond = lock.newCondition();
    // ��װ�˻���š��˻�����������Ա����
    private String          Account4No;
    private double          balance;
    // ��ʶ�˻����Ƿ����д������
    private boolean         flag = false;

    public Account4()
    {
    }

    // ������
    public Account4(String Account4No, double balance)
    {
        this.Account4No = Account4No;
        this.balance = balance;
    }

    // Account4No��setter��getter����
    public void setAccount4No(String Account4No)
    {
        this.Account4No = Account4No;
    }

    public String getAccount4No()
    {
        return this.Account4No;
    }

    // ����˻�����������޸ģ�����ֻΪbalance�ṩgetter������
    public double getBalance()
    {
        return this.balance;
    }

    public void draw(double drawAmount)
    {
        // ����
        lock.lock();
        try
        {
            // ���flagΪ�٣������˻��л�û���˴�Ǯ��ȥ��ȡǮ��������
            if (!flag)
            {
                cond.await();
            }
            else
            {
                // ִ��ȡǮ
                System.out.println(Thread.currentThread().getName() + " ȡǮ:"
                        + drawAmount);
                balance -= drawAmount;
                System.out.println("�˻����Ϊ��" + balance);
                // ����ʶ�˻��Ƿ����д��������Ϊfalse��
                flag = false;
                // ���������߳�
                cond.signalAll();
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        // ʹ��finally�����ͷ���
        finally
        {
            lock.unlock();
        }
    }

    public void deposit(double depositAmount)
    {
        lock.lock();
        try
        {
            // ���flagΪ�棬�����˻��������˴�Ǯ��ȥ�����Ǯ��������
            if (flag) // ��
            {
                cond.await();
            }
            else
            {
                // ִ�д��
                System.out.println(Thread.currentThread().getName() + " ���:"
                        + depositAmount);
                balance += depositAmount;
                System.out.println("�˻����Ϊ��" + balance);
                // ����ʾ�˻��Ƿ����д��������Ϊtrue
                flag = true;
                // ���������߳�
                cond.signalAll();
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        // ʹ��finally�����ͷ���
        finally
        {
            lock.unlock();
        }
    }
}

class DepositThread4 extends Thread
{
    // ģ���û��˻�
    private Account4 Account4;
    // ��ǰȡǮ�߳���ϣ������Ǯ��
    private double  depositAmount;

    public DepositThread4(String name, Account4 Account4, double depositAmount)
    {
        super(name);
        this.Account4 = Account4;
        this.depositAmount = depositAmount;
    }

    // �ظ�100��ִ�д�����
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            Account4.deposit(depositAmount);
        }
    }
}

class DrawThread4 extends Thread
{
    // ģ���û��˻�
    private Account4 Account4;
    // ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
    private double  drawAmount;

    public DrawThread4(String name, Account4 Account4, double drawAmount)
    {
        super(name);
        this.Account4 = Account4;
        this.drawAmount = drawAmount;
    }

    // �ظ�100��ִ��ȡǮ����
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            Account4.draw(drawAmount);
        }
    }
}

public class DrawTest3
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // ����һ���˻�
        Account4 acct = new Account4("1234567", 0);
        new DrawThread4("ȡǮ��", acct, 800).start();
        new DepositThread4("����߼�", acct, 800).start();
        new DepositThread4("�������", acct, 800).start();
        new DepositThread4("����߱�", acct, 800).start();
    }

}
