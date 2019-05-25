package com.hugeyurt.Collection;

import java.util.*;
import java.io.*;

public class PropertiesTest
{
    public static void main(String[] args) throws Exception
    {
        Properties props = new Properties();
        // 向Properties中增加属性
        props.setProperty("username", "zhangsan"); //put
        props.setProperty("password", "123456");   //put
        
        System.out.println(props);
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("username2"));
        System.out.println(props.getProperty("username2", "tmpName"));
        
        // 将Properties中的key-value对保存到a.ini文件中
        props.store(new FileOutputStream("a.ini"), "prop firest test"); // ①
        //props.store(new FileOutputStream("C://a.ini"), "prop firest test"); // ①
        
        
        // 新建一个Properties对象
        Properties props2 = new Properties();
        System.out.println(props2);
        // 向Properties中增加属性
        props2.setProperty("gender", "male");
        System.out.println(props2);
        // 将a.ini文件中的key-value对追加到props2中
        props2.load(new FileInputStream("a.ini")); // ②//  "C://a.ini"
        System.out.println(props2);
        
        props2.load(new FileInputStream("b.ini")); // ②//  "C://a.ini"
        System.out.println(props2);
    }
}
