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
        // �ɶԷ�����key-value��
        map.put("����", 109); // new Intger(109)
        map.put("��ѧ", 10);
        map.put("Ӣ��", 79);
        
        System.out.println(map);  
        // ��η����key-value����value�����ظ�
        System.out.println(map.put("����", 99));
        System.out.println(map);
        
        // �����ظ���keyʱ���µ�value�Ḳ��ԭ�е�value
        // ����µ�value������ԭ�е�value���÷������ر����ǵ�value
        System.out.println(map.put("��ѧ", 99)); // ���10
        System.out.println(map); // �����Map���ϰ���4��key-value��
        
        // �ж��Ƿ����ָ��key
        System.out.println("�Ƿ����ֵΪ ��ѧ key��" + map.containsKey("��ѧ")); // ���true
        // �ж��Ƿ����ָ��value
        System.out.println("�Ƿ����ֵΪ 99 value��" + map.containsValue(99)); // ���true
        // ��ȡMap���ϵ�����key��ɵļ��ϣ�ͨ������key��ʵ�ֱ�������key-value��
        
         map.remove("Ӣ��"); // ����key��ɾ��key-value�ԡ�
         System.out.println(map); // ���������ٰ��� Ӣ��=79 ��key-value��
         
        Set<String> keys = map.keySet();
        for (String key : keys)
        {
            // map.get(key)������ȡָ��key��Ӧ��value
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
        // ��ͼ������keyΪnull��key-value�Է���HashMap��
        hm.put(null , null);
        hm.put(null , null);    
        // ��һ��valueΪnull��key-value�Է���HashMap��
        hm.put("a" , null);    
        // ���Map����
        System.out.println(hm);
    }

}
