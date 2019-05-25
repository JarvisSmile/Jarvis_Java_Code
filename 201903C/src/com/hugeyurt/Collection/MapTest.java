package com.hugeyurt.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<String, Integer>();
        // 成对放入多个key-value对
        map.put("语文", 109); // new Intger(109)
        map.put("数学", 10);
        map.put("英语", 79);
        
        System.out.println(map);  
        // 多次放入的key-value对中value可以重复
        System.out.println(map.put("物理", 99));
        System.out.println(map);
        
        // 放入重复的key时，新的value会覆盖原有的value
        // 如果新的value覆盖了原有的value，该方法返回被覆盖的value
        System.out.println(map.put("数学", 99)); // 输出10
        System.out.println(map); // 输出的Map集合包含4个key-value对
        
        // 判断是否包含指定key
        System.out.println("是否包含值为 数学 key：" + map.containsKey("数学")); // 输出true
        // 判断是否包含指定value
        System.out.println("是否包含值为 99 value：" + map.containsValue(99)); // 输出true
        // 获取Map集合的所有key组成的集合，通过遍历key来实现遍历所有key-value对
        
         map.remove("英语"); // 根据key来删除key-value对。
         System.out.println(map); // 输出结果不再包含 英语=79 的key-value对
         
        Set<String> keys = map.keySet();
        for (String key : keys)
        {
            // map.get(key)方法获取指定key对应的value
            //System.out.println(key + "-->");// + map.get(key));
            System.out.println(key + "-->"+ map.get(key));
        }
        
        Collection<Integer> vals = map.values();
        for (Integer val : vals)
        {
            System.out.println(val);
        }
        
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrys)
        {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
        
        HashMap hm = new HashMap();
        // 试图将两个key为null的key-value对放入HashMap中
        hm.put(null , null);
        hm.put(null , null);    
        // 将一个value为null的key-value对放入HashMap中
        hm.put("a" , null);    
        // 输出Map对象
        System.out.println(hm);
    }

}
