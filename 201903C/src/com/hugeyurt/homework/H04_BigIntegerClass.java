package com.hugeyurt.homework;

public class H04_BigIntegerClass 
{
	char []biginteger;
	int []BI;
	public char[] getBiginteger() {
		return biginteger;
	}
	public void setBiginteger(char[] biginteger) {
		this.biginteger = biginteger;
	}
	public H04_BigIntegerClass(String s)
	{
		this.biginteger=s.toCharArray();
		this.BI=new int[biginteger.length];
		for(int i=0;i<biginteger.length;i++) {
			BI[i]=(int)biginteger[i]-48;
		}
	}
	public char []add(H04_BigIntegerClass s)
	{
		int []BI2=s.BI;
		int DOL=Math.abs(BI.length-BI2.length);
		if(BI.length>BI2.length)
		{
			for(int i=BI2.length-1;i>=0;i--)
			{
				BI[i+DOL]+=BI2[i];
				if(BI[i+DOL]>=10)
				{
					BI[i-1+DOL]+=1;
					BI[i+DOL]-=10;
				}
			}
			for(int i=DOL-1;i>0;i--)
			{
				if(BI[i]>=10)
				{
					BI[i-1]+=1;
					BI[i]-=10;
				}
			}
			if(BI[0]>=10)
			{
				biginteger=new char [BI.length+1];
				biginteger[0]='1';
				BI[0]-=10;
				for(int i=1;i<biginteger.length;i++) 
				{
					biginteger[i]=(char) (BI[i-1]+48);
				}
				 return biginteger;
			}
			else
			{
				for(int i=0;i<biginteger.length;i++) 
				{
					biginteger[i]=(char) (BI[i]+48);
				}
				return biginteger;
			}
			
		}
		else if(BI.length<BI2.length)
		{
			for(int i=BI.length-1;i>=0;i--)
			{
				BI2[i+DOL]+=BI[i];
				if(BI2[i+DOL]>=10)
				{
					BI2[i-1+DOL]+=1;
					BI2[i+DOL]-=10;
				}
			}
			for(int i=DOL-1;i>0;i--)
			{
				if(BI2[i]>=10)
				{
					BI2[i-1]+=1;
					BI2[i]-=10;
				}
			}
			if(BI2[0]>=10)
			{
				biginteger=new char [BI2.length+1];
				biginteger[0]='1';
				BI2[0]-=10;
				for(int i=1;i<biginteger.length;i++) {
					biginteger[i]=(char) (BI2[i-1]+48);
				}
				 return biginteger;
			}
			else
			{
				for(int i=0;i<biginteger.length;i++) {
					biginteger[i]=(char) (BI2[i]+48);
				}
				return biginteger;
			}
		}
		else
		{
			for(int i=BI2.length-1;i>=0;i--)
			{
				BI[i]+=BI2[i];
				if(BI[i]>=10&&i>1)
				{
					BI[i-1]+=1;
					BI[i]-=10;
				}
			}
			if(BI[0]>=10)
			{
				biginteger=new char [BI.length+1];
				biginteger[0]='1';
				BI[0]-=10;
				for(int i=1;i<biginteger.length;i++) {
					biginteger[i]=(char) (BI[i-1]+48);
				}
				 return biginteger;
			}
			else
			{
				for(int i=0;i<biginteger.length;i++) {
					biginteger[i]=(char) (BI[i]+48);
				}
				return biginteger;
			}
		}
	}
	
	public char []Sub(H04_BigIntegerClass s)
	{
		int []BI2=s.BI;
		if(BI.length>BI2.length)
		{
			
		}
		else if(BI.length<BI2.length)
		{
			
		}
		else
		{
			
		}
		return this.biginteger;
	}
}
