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
        books.add("语文");
        books.add("数学");
        System.out.println(books);
        
        // 删除 语文
        books.remove("语文");
        // 重新添加 语文
        books.add("语文");

        // 元素顺序总是和添加顺序一致
        System.out.println(books);
    }
}
