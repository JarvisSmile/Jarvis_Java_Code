package com.hugeyurt.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student
{

    Map<String, Integer> Score = new HashMap<String, Integer>();
    public Student(int Math,int Chinese,int English)
    {
    	this.Score.put("Math", Math);
    	this.Score.put("Chinese", Chinese);
    	this.Score.put("English", English);
    }
	@Override
	public String toString() {
		return ""+Score;
	}
	public boolean isQualified()
	{
		if(this.Score.get("Math")>=60&&this.Score.get("Chinese")>=60&&this.Score.get("English")>=60)
			return true;
		return false;
	}
	
}
public class StudentMgr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Student> stu = new HashMap<String, Student>();
		stu.put("a",new Student(110,110,110));
		stu.put("b",new Student(60,110,110));
		stu.put("c",new Student(10,110,110));
		stu.put("d",new Student(110,20,110));
		
        Set<Entry<String, Student>> entrys1 = stu.entrySet();
        for (Entry<String, Student> entry1 : entrys1)
        {
            System.out.println(entry1.getKey() );
            Set<Entry<String, Integer>> entrys2 = entry1.getValue().Score.entrySet();
            for (Entry<String, Integer> entry2 : entrys2)
            {
                System.out.println(entry2.getKey() + " ---> " + entry2.getValue());
            }
        }
		System.out.println();
	}

}
