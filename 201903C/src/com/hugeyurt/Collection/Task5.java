package com.hugeyurt.Collection;

import java.util.*;

class Score
{
    final static int PASS_SCORE = 60;
    private double math;
    private double english;
    private double chinese;
    
    Score(double math, double english, double chinese)
    {
        this.math    = math;
        this.english = english;
        this.chinese = chinese;
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "math = " + math + ", english = " + english 
                + ", chinese = " + chinese;
    }
    
    double getTotal()
    {
        return math + english + chinese;
    }
    
    boolean isPass()
    {
        if (math >= PASS_SCORE && english >= PASS_SCORE && chinese >= PASS_SCORE)
        {
            return true;
        }
        return false;
    }
}

class StuScoreMgr
{
    private Map<String, Score> stuScoreMap = new HashMap<String, Score>();
    
    void add(String name, double math, double english, double chinese)
    {
        if (null != name)
        {
            stuScoreMap.put(name, new Score(math, english, chinese));
        }  
    }
    
    void displayByName(String name)
    {
        if (null != name)
        {
            System.out.println(stuScoreMap.get(name));
        }
    }
    
    void displayInfoOfMaxScore()
    {
        Set<Map.Entry<String, Score>> entrys = stuScoreMap.entrySet();
        double maxScore = 0;
        Map.Entry<String, Score> maxEntry = null;
        for (Map.Entry<String, Score> entry : entrys)
        {
            double tmpScore = entry.getValue().getTotal();
            if (tmpScore > maxScore)
            {
                maxScore = tmpScore;
                maxEntry = entry;
            }
        }
        
        System.out.println("The name of max score: " + maxEntry.getKey());
        System.out.println("max score: " + maxScore);
        System.out.println("score detail: " + maxEntry.getValue());
    }
    
    void displayNotPassNum()
    {
        int sum = 0;
        Collection<Score> vals = stuScoreMap.values();
        for (Score val : vals)
        {
            if (val.isPass())
            {
                ++sum;
            }
        }
        
        System.out.println("The Pass Num: " + sum);
    }
}
public class Task5
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        StuScoreMgr stuScoreMgr = new StuScoreMgr();
        stuScoreMgr.add("zhangsan", 60, 80, 90);
        stuScoreMgr.add("lisi", 60, 60, 90);
        stuScoreMgr.add("wanger", 100, 80, 90);
        stuScoreMgr.add("zhaosi", 60, 40, 90);
        
        stuScoreMgr.displayByName("wanger");
        stuScoreMgr.displayInfoOfMaxScore();
        stuScoreMgr.displayNotPassNum();
    }

}
