package nestedForLoopStatement;

public class SocietyAndFlatprint 

{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)   //   for SOCIETY
		{
			System.out.println("Society"+i); 
			
			for(int j=1;j<=5;j++)  // for FLAT
			{
				System.out.println("Flat-->"+j);
			}
		}
		
	}

}
