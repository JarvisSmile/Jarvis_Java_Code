package First;
import java.util. * ;
public class guoziwei1 
{
	public static void main(String args[]) 
	{
		int a=11;
		int i=0;
		while(a<50) 
		{
			if(a%3==0)
			{
				System.out.printf("%d",a);
			    System.out.printf(" ");
			    i++;
			    if(i%5==0)
			    System.out.println();
			}
			a++;
		}
	}

}