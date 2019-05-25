package com.hugeyurt.Thread;

import java.util.concurrent.locks.*;

//class Account
//{
//    // 封装账户编号、账户余额的两个成员变量
//    private String accountNo;
//    private double balance;
//    // 标识账户中是否已有存款的旗标
//    private boolean flag = false;
//
//    public Account(){}
//    // 构造器
//    public Account(String accountNo , double balance)
//    {
//        this.accountNo = accountNo;
//        this.balance = balance;
//    }
//
//    // accountNo的setter和getter方法
//    public void setAccountNo(String accountNo)
//    {
//        this.accountNo = accountNo;
//    }
//    public String getAccountNo()
//    {
//        return this.accountNo;
//    }
//    // 因此账户余额不允许随便修改，所以只为balance提供getter方法，
//    public double getBalance()
//    {
//        return this.balance;
//    }
//
//    public synchronized void draw(double drawAmount)
//    {
//        try
//        {
//            // 如果flag为假，表明账户中还没有人存钱进去，取钱方法阻塞
//            if (!flag)
//            {
//                wait();
//            }
//            else
//            {
//                // 执行取钱
//                System.out.println(Thread.currentThread().getName()
//                    + " 取钱:" +  drawAmount);
//                balance -= drawAmount;
//                System.out.println("账户余额为：" + balance);
//                // 将标识账户是否已有存款的旗标设为false。
//                flag = false;
//                // 唤醒其他线程
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
//            // 如果flag为真，表明账户中已有人存钱进去，则存钱方法阻塞
//            if (flag)             //①
//            {
//                wait();
//            }
//            else
//            {
//                // 执行存款
//                System.out.println(Thread.currentThread().getName()
//                    + " 存款:" +  depositAmount);
//                balance += depositAmount;
//                System.out.println("账户余额为：" + balance);
//                // 将表示账户是否已有存款的旗标设为true
//                flag = true;
//                // 唤醒其他线程
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
    // 显式定义Lock对象
    private final Lock      lock = new ReentrantLock();
    // 获得指定Lock对象对应的Condition
    private final Condition cond = lock.newCondition();
    // 封装账户编号、账户余额的两个成员变量
    private String          Account4No;
    private double          balance;
    // 标识账户中是否已有存款的旗标
    private boolean         flag = false;

    public Account4()
    {
    }

    // 构造器
    public Account4(String Account4No, double balance)
    {
        this.Account4No = Account4No;
        this.balance = balance;
    }

    // Account4No的setter和getter方法
    public void setAccount4No(String Account4No)
    {
        this.Account4No = Account4No;
    }

    public String getAccount4No()
    {
        return this.Account4No;
    }

    // 因此账户余额不允许随便修改，所以只为balance提供getter方法，
    public double getBalance()
    {
        return this.balance;
    }

    public void draw(double drawAmount)
    {
        // 加锁
        lock.lock();
        try
        {
            // 如果flag为假，表明账户中还没有人存钱进去，取钱方法阻塞
            if (!flag)
            {
                cond.await();
            }
            else
            {
                // 执行取钱
                System.out.println(Thread.currentThread().getName() + " 取钱:"
                        + drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额为：" + balance);
                // 将标识账户是否已有存款的旗标设为false。
                flag = false;
                // 唤醒其他线程
                cond.signalAll();
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        // 使用finally块来释放锁
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
            // 如果flag为真，表明账户中已有人存钱进去，则存钱方法阻塞
            if (flag) // ①
            {
                cond.await();
            }
            else
            {
                // 执行存款
                System.out.println(Thread.currentThread().getName() + " 存款:"
                        + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额为：" + balance);
                // 将表示账户是否已有存款的旗标设为true
                flag = true;
                // 唤醒其他线程
                cond.signalAll();
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        // 使用finally块来释放锁
        finally
        {
            lock.unlock();
        }
    }
}

class DepositThread4 extends Thread
{
    // 模拟用户账户
    private Account4 Account4;
    // 当前取钱线程所希望存款的钱数
    private double  depositAmount;

    public DepositThread4(String name, Account4 Account4, double depositAmount)
    {
        super(name);
        this.Account4 = Account4;
        this.depositAmount = depositAmount;
    }

    // 重复100次执行存款操作
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
    // 模拟用户账户
    private Account4 Account4;
    // 当前取钱线程所希望取的钱数
    private double  drawAmount;

    public DrawThread4(String name, Account4 Account4, double drawAmount)
    {
        super(name);
        this.Account4 = Account4;
        this.drawAmount = drawAmount;
    }

    // 重复100次执行取钱操作
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
        // 创建一个账户
        Account4 acct = new Account4("1234567", 0);
        new DrawThread4("取钱者", acct, 800).start();
        new DepositThread4("存款者甲", acct, 800).start();
        new DepositThread4("存款者乙", acct, 800).start();
        new DepositThread4("存款者丙", acct, 800).start();
    }

}
