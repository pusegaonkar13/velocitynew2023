package nestedIfStatement;

public class EligibilityForBloodDonation 
{
	public static void main(String[] args)
	{
		int age =34;
		int weight =55;
		
		if(age>18)
		{
			System.out.println("Check weight Now");
			
			if(weight>50)
			{
				System.out.println("Donate the blood");
			}
			else
			{
				 System.out.println("Can't denote the blood");
	
			}
			
		}
		else
		{
			System.out.println("Not eligiable due to age criteria");
		}
		
		
		
	}

}
