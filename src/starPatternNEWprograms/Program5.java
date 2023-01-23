// WAP TO PRINT FOLLEING STAR PATTERN
//				*
//			   **
//			  ***
//			 ****
//          *****

package starPatternNEWprograms;

public class Program5 

{
	public static void main(String[] args)
	
	{
		for(int i=1;i<=5;i++)               //FOR column
		{
			for(int j=5;j>i;j--)		    //FOR space
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)          //FOR ROW
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		
	}

}
