package com.hugeyurt.Collection;
import java.util.*;

public class ListTest
{
    public static void main(String[] args)
    {
        List<String> books = new ArrayList<String>();
        // ��books�������������Ԫ��
        books.add(new String("����"));
        books.add(new String("��ѧ"));
        books.add(new String("Ӣ��"));
        System.out.println(books);
        
        
        // �����ַ�����������ڵڶ���λ��
        books.add(1, new String("����"));
        
        
        for (int i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i));
        }
        
        
        // ɾ��������Ԫ��
        books.remove(2);
        System.out.println(books);
        
        // �ж�ָ��Ԫ����List������λ�ã����1������λ�ڵڶ�λ
        System.out.println(books.indexOf(new String("����"))); // ��
        
        // ���ڶ���Ԫ���滻���µ��ַ�������
        books.set(1, new String("��ѧ"));
        System.out.println(books);
        
        // ��books���ϵĵڶ���Ԫ�أ�������
        // ��������Ԫ�أ�����������ȡ���Ӽ���
        System.out.println(books.subList(0, 2)); // [ )
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        //list.remove(3);
        //list.remove(1);
        list.remove(new Integer(3));
        System.out.println(list); //5 2 1  or   [5 3 2]
    }
}


