package com.hugeyurt.Thread;
class OddEvenThread extends Thread
{
    private int start;
    private int end;
    
    OddEvenThread(String name, int start, int end)
    {
        super(name);
        this.start = start;
        this.end   = end;
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        for (int i = start; i <= end; i+=2)
        {
            System.out.println(getName() + " -> " + i);
        }
    }
}

public class Test1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        new OddEvenThread("Å¼Êı", 0, 100).start();
        new OddEvenThread("ÆæÊı", 1, 100).start();
    }

}
