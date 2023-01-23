// WAP TO FIND GREATEST COMMAN DIVISOR

package numberPrograms;

public class Program4 
{
	public static void main(String[] args)
	
	{
//		 Progrm of GCD using while loop and if condition 
		int n1=81;
		int n2=153;
	
		while(n1 != n2)
		{
			if(n1 > n2)
			{
				n1 -= n2;
			}
			else
			{
				n2 -= n1;
			}
			
		}
		System.out.println("GCD---> " + n1);
		
				
	}
	
			

}
