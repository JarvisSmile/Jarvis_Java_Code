package com.hugeyurt.Collection;

import java.util.*;

public class WeakHashMapTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        WeakHashMap<String, String> whm = new WeakHashMap<String, String>();
        //HashMap<String, String> whm = new HashMap<String, String>();
        // ��WeakHashMap���������key-value�ԣ�
        // ����key���������ַ�������û���������ã�
        String yw = new String("����");
        whm.put(yw, new String("����"));
        whm.put(new String("��ѧ") , new String("����"));
        whm.put(new String("Ӣ��") , new String("�е�"));
        //�� WeakHashMap�����һ��key-value�ԣ�
        // ��key��һ��ϵͳ������ַ�������
        whm.put("java" , new String("�е�"));    // ��
        // ���whm���󣬽�����4��key-value�ԡ�
        System.out.println(whm);
        
        //yw = null;
        // ֪ͨϵͳ����������������
        System.gc();
        System.runFinalization();
        // ͨ������£���ֻ����һ��key-value�ԡ�
        System.out.println(whm);
    }

}
