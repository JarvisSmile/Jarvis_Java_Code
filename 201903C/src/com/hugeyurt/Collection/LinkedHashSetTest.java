package com.hugeyurt.Collection;

import java.util.*;

/**
 * Description:
 * 
 * @version 1.0
 */
public class LinkedHashSetTest
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> books = new LinkedHashSet<String>();
        //HashSet<String> books = new HashSet<String>();
        books.add("����");
        books.add("��ѧ");
        System.out.println(books);
        
        // ɾ�� ����
        books.remove("����");
        // ������� ����
        books.add("����");

        // Ԫ��˳�����Ǻ����˳��һ��
        System.out.println(books);
    }
}
