package com.hugeyurt.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <String>books=new HashSet();
		books.add("����");
		books.add("��ѧ");
		books.add("Ӣ��");
		
		Object[] objs=books.toArray();
		for(Object obj:objs)
		{
			System.out.println(obj);
		}
		Iterator<String> it = books.iterator();
        while(it.hasNext())
        {
            String book = it.next();
            System.out.println(book);
            
            if (book.equals("��ѧ"))
            {
                // �Ӽ�����ɾ����һ��next�������ص�Ԫ��
                it.remove();
                //books.remove("Ӣ��");
            }
            book = "�����ַ���";   //��
        }
        System.out.println(books);    
        System.out.println("foreatch:----->");
        for (String str : books)
        {
            System.out.println(str);
            if (str.equals("��ѧ"))
            {
                books.remove("��ѧ");
            }
        }
	}
	

}
