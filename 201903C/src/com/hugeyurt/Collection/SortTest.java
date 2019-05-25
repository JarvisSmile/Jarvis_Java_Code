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
        System.out.println(nums); // 输出:[2, -5, 3, 0]

        Collections.reverse(nums); // 将List集合元素的次序反转
        System.out.println(nums); // 输出:[0, 3, -5, 2]

        Collections.sort(nums); // 将List集合元素的按自然顺序排序
        System.out.println(nums); // 输出:[-5, 0, 2, 3]

        Collections.sort(nums, new MyIntComp()); // 将List集合元素的按自然顺序排序
        System.out.println(nums); // 输出:[-5, 0, 2, 3]
        
        Collections.shuffle(nums); // 将List集合元素的按随机顺序排序
        System.out.println(nums); // 每次输出的次序不固定
        
        System.out.println(Collections.max(nums)); // 输出最大元素，将输出3
        System.out.println(Collections.min(nums)); // 输出最小元素，将输出-5
 
        System.out.println(Collections.max(nums, new MyIntComp())); // 输出最大元素，将输出3
        System.out.println(Collections.min(nums, new MyIntComp())); // 输出最小元素，将输出-5
        
        
        Collections.replaceAll(nums , 0 , 1); // 将nums中的0使用1来代替
        System.out.println(nums); // 输出:[2, -5, 3, 1]
        // 判断-5在List集合中出现的次数，返回1
        System.out.println(Collections.frequency(nums , -5));
        
        Collections.sort(nums); // 对nums集合排序
        System.out.println(nums); // 输出:[-5, 1, 2, 3]
        //只有排序后的List集合才可用二分法查询，输出3
        System.out.println(Collections.binarySearch(nums , -5));
        
        //ConcurrentHashMap   HashTable
    }
}
