package com.hugeyurt.Thread;

class Account5
{
    /*
     * ����һ��ThreadLocal���͵ı������ñ�������һ���ֲ߳̾����� ÿ���̶߳��ᱣ���ñ�����һ������
     */
    private ThreadLocal<String> name = new ThreadLocal<String>();

    // ����һ����ʼ��name��Ա�����Ĺ�����
    public Account5(String str)
    {
        this.name.set(str);
        // ����������ڷ��ʵ�ǰ�̵߳�name������ֵ
        System.out.println("---" + this.name.get());
    }

    // name��setter��getter����
    public String getName()
    {
        return name.get();
    }

    public void setName(String str)
    {
        this.name.set(str);
    }
}

class MyTest extends Thread
{
    // ����һ��Account5���͵ĳ�Ա����
    private Account5 Account5;

    public MyTest(Account5 Account5, String name)
    {
        super(name);
        this.Account5 = Account5;
    }

    public void run()
    {
        // ѭ��10��
        for (int i = 0; i < 10; i++)
        {
            // ��i == 6ʱ������˻����滻�ɵ�ǰ�߳���
            if (i == 6)
            {
                Account5.setName(getName());
            }
            // ���ͬһ���˻����˻�����ѭ������
            System.out.println(Account5.getName() + " �˻���iֵ��" + i);
        }
    }
}

public class ThreadLocalTest
{
    public static void main(String[] args)
    {
        // ���������̣߳������̹߳���ͬһ��Account5
        Account5 at = new Account5("��ʼ��");
        /*
         * ��Ȼ�����̹߳���ͬһ���˻�����ֻ��һ���˻��� �������˻�����ThreadLocal���͵ģ�����ÿ���߳�
         * ����ȫӵ�и��Ե��˻������������Դ�i == 6֮�󣬽��������� �̷߳���ͬһ���˻�ʱ������ͬ���˻�����
         */
        new MyTest(at, "�̼߳�").start();
        new MyTest(at, "�߳���").start();
    }
}
