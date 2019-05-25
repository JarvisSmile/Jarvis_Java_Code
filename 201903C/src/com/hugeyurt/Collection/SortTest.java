package com.hugeyurt.Collection;

import java.util.*;

class MyIntComp implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        // TODO Auto-generated method stub
        return o2 - o1;
    }
}

public class SortTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums); // ���:[2, -5, 3, 0]

        Collections.reverse(nums); // ��List����Ԫ�صĴ���ת
        System.out.println(nums); // ���:[0, 3, -5, 2]

        Collections.sort(nums); // ��List����Ԫ�صİ���Ȼ˳������
        System.out.println(nums); // ���:[-5, 0, 2, 3]

        Collections.sort(nums, new MyIntComp()); // ��List����Ԫ�صİ���Ȼ˳������
        System.out.println(nums); // ���:[-5, 0, 2, 3]
        
        Collections.shuffle(nums); // ��List����Ԫ�صİ����˳������
        System.out.println(nums); // ÿ������Ĵ��򲻹̶�
        
        System.out.println(Collections.max(nums)); // ������Ԫ�أ������3
        System.out.println(Collections.min(nums)); // �����СԪ�أ������-5
 
        System.out.println(Collections.max(nums, new MyIntComp())); // ������Ԫ�أ������3
        System.out.println(Collections.min(nums, new MyIntComp())); // �����СԪ�أ������-5
        
        
        Collections.replaceAll(nums , 0 , 1); // ��nums�е�0ʹ��1������
        System.out.println(nums); // ���:[2, -5, 3, 1]
        // �ж�-5��List�����г��ֵĴ���������1
        System.out.println(Collections.frequency(nums , -5));
        
        Collections.sort(nums); // ��nums��������
        System.out.println(nums); // ���:[-5, 1, 2, 3]
        //ֻ��������List���ϲſ��ö��ַ���ѯ�����3
        System.out.println(Collections.binarySearch(nums , -5));
        
        //ConcurrentHashMap   HashTable
    }
}
