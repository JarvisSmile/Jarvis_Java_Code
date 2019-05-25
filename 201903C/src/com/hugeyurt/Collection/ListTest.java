package com.hugeyurt.Collection;
import java.util.*;

public class ListTest
{
    public static void main(String[] args)
    {
        List<String> books = new ArrayList<String>();
        // 向books集合中添加三个元素
        books.add(new String("语文"));
        books.add(new String("数学"));
        books.add(new String("英语"));
        System.out.println(books);
        
        
        // 将新字符串对象插入在第二个位置
        books.add(1, new String("物理"));
        
        
        for (int i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i));
        }
        
        
        // 删除第三个元素
        books.remove(2);
        System.out.println(books);
        
        // 判断指定元素在List集合中位置：输出1，表明位于第二位
        System.out.println(books.indexOf(new String("物理"))); // ①
        
        // 将第二个元素替换成新的字符串对象
        books.set(1, new String("数学"));
        System.out.println(books);
        
        // 将books集合的第二个元素（包括）
        // 到第三个元素（不包括）截取成子集合
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


