// StarProgam 13

//        **********
//         *******
//          *****
//           ***
//            *

package starPattenProgram;

public class Starprogram13 

{
	public static void main(String[] args) 
	
	{
		
		for(int i=1;i<=5;i++) // for loop for rows
	{
		for(int j=1;j<=i;j++) // for loop for space
		{
			System.out.print(" ");
		}
		for(int k=3;k>=i;k--)
		{
			System.out.print("*");
		}
		for(int l=5;l>=i;l--)
		{
			System.out.print("*");
		}
		System.out.println();
		
		}
	}
}
