package com.hugeyurt.Collection;

import java.util.*;

class Z implements Comparable<Z>
{
    int age;

    public Z(int age)
    {
        this.age = age;
    }

    // ��дequals()���������Ƿ���true
//    public boolean equals(Object obj)
//    {
//        return true;
//    }

    // ��д��compareTo(Object obj)���������Ƿ���1
    public int compareTo(Z obj)
    {
        return 1;
    }
}

public class TreeSetTest2
{
    public static void main(String[] args)
    {
        TreeSet<Z> set = new TreeSet<Z>();
        Z z1 = new Z(6);
        set.add(z1);
        // �ڶ�������ͬһ���������true���������ӳɹ�
        System.out.println(set.add(z1)); // ��
        // �������set���ϣ�������������Ԫ��
        System.out.println(set);
        // �޸�set���ϵĵ�һ��Ԫ�ص�age����
        ((Z) (set.first())).age = 9;
        // ���set���ϵ����һ��Ԫ�ص�age������������Ҳ�����9
        System.out.println(((Z) (set.last())).age);
    }
}