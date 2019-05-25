package com.hugeyurt.Collection;

import java.util.*;
import java.io.*;

public class PropertiesTest
{
    public static void main(String[] args) throws Exception
    {
        Properties props = new Properties();
        // ��Properties����������
        props.setProperty("username", "zhangsan"); //put
        props.setProperty("password", "123456");   //put
        
        System.out.println(props);
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("username2"));
        System.out.println(props.getProperty("username2", "tmpName"));
        
        // ��Properties�е�key-value�Ա��浽a.ini�ļ���
        props.store(new FileOutputStream("a.ini"), "prop firest test"); // ��
        //props.store(new FileOutputStream("C://a.ini"), "prop firest test"); // ��
        
        
        // �½�һ��Properties����
        Properties props2 = new Properties();
        System.out.println(props2);
        // ��Properties����������
        props2.setProperty("gender", "male");
        System.out.println(props2);
        // ��a.ini�ļ��е�key-value��׷�ӵ�props2��
        props2.load(new FileInputStream("a.ini")); // ��//  "C://a.ini"
        System.out.println(props2);
        
        props2.load(new FileInputStream("b.ini")); // ��//  "C://a.ini"
        System.out.println(props2);
    }
}
