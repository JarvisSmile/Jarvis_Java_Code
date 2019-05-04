package com.hugeyurt.Collection;
import java.util.*;

public class CollectionTest
{
    public static void main(String[] args)
    {
        Integer o1 = 10;
        Integer o2 = 10;
        Integer o3 = -129; //-129 -- 128
        Integer o4 = -129; //
        System.out.println(o1 == o2);
        System.out.println(o3 == o4);
        
        Collection c = new ArrayList();
        // 添加元素
        c.add("孙悟空"); // ---c.add(new String("孙悟空"));
        // 虽然集合里不能放基本类型的值，但Java支持自动装箱
        c.add(6); // c.add(new Integer(6));
        //c.add(6); 
        System.out.println("c集合的元素个数为:" + c.size()); // 输出2
        // 删除指定元素
        c.remove(6); // c.remove(new Integer(6));
        System.out.println("c集合的元素个数为:" + c.size()); // 输出1
        // 判断是否包含指定字符串
        System.out.println("c集合的是否包含\"孙悟空\"字符串:" + c.contains("孙悟空")); // 输出true
        c.add("语文");
        System.out.println("c集合的元素：" + c);//c.tostring();
        
        
        Collection books = new HashSet();
        books.add("语文");
        books.add("数学");
        System.out.println("c集合是否完全包含books集合？" + c.containsAll(books)); // 输出false
        // 用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合的元素：" + c);
        // 删除c集合里所有元素
        c.clear();
        System.out.println("c集合的元素：" + c);
        // 控制books集合里只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合的元素:" + books);
        
        System.out.println(books.isEmpty());
        System.out.println(books.size() == 0);
    }
}
