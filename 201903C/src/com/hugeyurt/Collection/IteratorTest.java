package com.hugeyurt.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <String>books=new HashSet();
		books.add("语文");
		books.add("数学");
		books.add("英语");
		
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
            
            if (book.equals("数学"))
            {
                // 从集合中删除上一次next方法返回的元素
                it.remove();
                //books.remove("英语");
            }
            book = "测试字符串";   //①
        }
        System.out.println(books);    
        System.out.println("foreatch:----->");
        for (String str : books)
        {
            System.out.println(str);
            if (str.equals("数学"))
            {
                books.remove("数学");
            }
        }
	}
	

}
