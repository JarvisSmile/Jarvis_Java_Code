package com.hugeyurt.Thread;
import java.util.concurrent.locks.*;

//class Account
//{
//  // 封装账户编号、账户余额的两个成员变量
//  private String accountNo;
//  private double balance;
//
//  public Account()
//  {
//  }
//
//  // 构造器
//  public Account(String accountNo, double balance)
//  {
//      this.accountNo = accountNo;
//      this.balance = balance;
//  }
//
//  // accountNo的setter和getter方法
//  public void setAccountNo(String accountNo)
//  {
//      this.accountNo = accountNo;
//  }
//
//  public String getAccountNo()
//  {
//      return this.accountNo;
//  }
//
//  // balance的setter和getter方法
//  public void setBalance(double balance)
//  {
//      this.balance = balance;
//  }
//
//  public double getBalance()
//  {
//      return this.balance;
//  }
//  
//  
//  // 提供一个线程安全draw()方法来完成取钱操作
//  public synchronized void draw(double drawAmount)
//  {
//      // 账户余额大于取钱数目
//      if (balance >= drawAmount)
//      {
//          // 吐出钞票
//          System.out.println(Thread.currentThread().getName()
//              + "取钱成功！吐出钞票:" + drawAmount);
//          try
//          {
//              Thread.sleep(1);
//          }
//          catch (InterruptedException ex)
//          {
//              ex.printStackTrace();
//          }
//          // 修改余额
//          balance -= drawAmount;
//          System.out.println("\t余额为: " + balance);
//      }
//      else
//      {
//          System.out.println(Thread.currentThread().getName()
//              + "取钱失败！余额不足！");
//      }
//  }
//}

class Account
{
  // 定义锁对象 采用final修饰
  private final Lock lock = new ReentrantLock(); //private final ReentrantLock lock = new ReentrantLock();
  // 封装账户编号、账户余额的两个成员变量
  private String              accountNo;
  private double              balance;

  public Account()
  {
  }

  // 构造器
  public Account(String accountNo, double balance)
  {
      this.accountNo = accountNo;
      this.balance = balance;
  }

  // accountNo的setter和getter方法
  public void setAccountNo(String accountNo)
  {
      this.accountNo = accountNo;
  }

  public String getAccountNo()
  {
      return this.accountNo;
  }

  // 因此账户余额不允许随便修改，所以只为balance提供getter方法，
  public double getBalance()
  {
      return this.balance;
  }

  // 提供一个线程安全draw()方法来完成取钱操作
  public boolean draw(double drawAmount)
  {
      
      boolean bRes = false;
      
      // 加锁
      lock.lock();
//      if (!lock.tryLock())
//      {
//          System.out.println("System is busying!");
//          return;
//      }
      
//      while (!lock.tryLock())
//      {
//          System.out.println("System is busying!");
//          try
//          {
//              Thread.sleep(10);
//          }
//          catch (InterruptedException e)
//          {
//              // TODO Auto-generated catch block
//              e.printStackTrace();
//          }
//      }      
      
      try
      {
          // 账户余额大于取钱数目
          if (balance >= drawAmount)
          {
              // 吐出钞票
              System.out.println(Thread.currentThread().getName()
                      + "取钱成功！吐出钞票:" + drawAmount);
              try
              {
                  Thread.sleep(1);
              }
              catch (InterruptedException ex)
              {
                  ex.printStackTrace();
              }
              // 修改余额
              balance -= drawAmount;
              System.out.println("\t余额为: " + balance);
              bRes = true;
          }
          else
          {
              System.out.println(Thread.currentThread().getName()
                      + "取钱失败！余额不足！");
          }
          return bRes;
      }
      finally
      {
          // 修改完成，释放锁
          lock.unlock(); // lock.unlock()不调用会出现什么情况
      }
  }
  
  public void store(double drawAmount)
  {
      // 加锁
      lock.lock();
      
      try
      {
          this.balance += drawAmount;
      }
      finally
      {
          lock.unlock();
      }
  }
  
  public boolean transfer(Account targetAcc, double drawAmount)
  {
      if (null == targetAcc)
      {
          return false;
      }
      
      boolean bRes = false;
      
      // 加锁
      lock.lock();
      
      try
      {
          //取
          if (draw(drawAmount))
          {
              targetAcc.store(drawAmount);
              bRes = true;
          }
          return bRes;
      }
      finally
      {
          lock.unlock();
      }
  }
}

class DrawThread extends Thread
{
  // 模拟用户账户
  private Account account;
  // 当前取钱线程所希望取的钱数
  private double  drawAmount;

  // static private Object o = new Object();

  public DrawThread(String name, Account account, double drawAmount)
  {
      super(name);
      this.account = account;
      this.drawAmount = drawAmount;
  }

  // // 当多条线程修改同一个共享数据时，将涉及数据安全问题。
  // public void run()
  // {
  // synchronized (account)
  // {
  // // 账户余额大于取钱数目
  // if (account.getBalance() >= drawAmount)
  // {
  // // 吐出钞票
  // System.out.println(getName() + "取钱成功！吐出钞票:" + drawAmount);
  // try
  // {
  // Thread.sleep(10);
  // }
  // catch (InterruptedException ex)
  // {
  // ex.printStackTrace();
  // }
  // // 修改余额
  // account.setBalance(account.getBalance() - drawAmount);
  // System.out.println("\t余额为: " + account.getBalance());
  // }
  // else
  // {
  // System.out.println(getName() + "取钱失败！余额不足！");
  // }
  // }
  // }

  // 当多条线程修改同一个共享数据时，将涉及数据安全问题。
  public void run()
  {
      account.draw(drawAmount);
  }
}


class TransferThread extends Thread
{
  // 模拟用户账户
  private Account srcAccount;
  
  // 模拟用户账户
  private Account targetAccount;
  
  // 当前取钱线程所希望取的钱数
  private double  tranAmount;


  public TransferThread(String name, Account srcAccount, Account targetAccount, double tranAmount)
  {
      super(name);
      this.srcAccount = srcAccount;
      this.targetAccount = targetAccount;
      this.tranAmount = tranAmount;
  }

  // 当多条线程修改同一个共享数据时，将涉及数据安全问题。
  public void run()
  {
      srcAccount.transfer(targetAccount, tranAmount);
  }
}


public class DrawTest
{

  public static void main(String[] args) throws InterruptedException
  {
      // TODO Auto-generated method stub
      // 创建一个账户
//      Account acct = new Account("1234567", 1000);
//
//      // 模拟两个线程对同一个账户取钱
//      new DrawThread("甲", acct, 800).start();
//      new DrawThread("乙", acct, 800).start();
      
      
      Account acct = new Account("1234567", 1000);
      Account acct2 = new Account("111111", 100);
      
      // 模拟两个线程对同一个账户取钱
      new TransferThread("甲", acct, acct2, 800).start();
      new TransferThread("乙", acct, acct2, 200).start();
      
      Thread.sleep(10);
      
      System.out.println(acct.getAccountNo() + " -> " + acct.getBalance());
      System.out.println(acct2.getAccountNo() + " -> " + acct2.getBalance());
  }

}
