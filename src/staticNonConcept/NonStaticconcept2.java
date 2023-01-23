// In this program 
// 1 . create constructor 
// 2 . create oject for calling constructor



package staticNonConcept;

public class NonStaticconcept2 // class name

{
	String name;
	int rollNo;
	char bloodGroup;
	int mobileNo;	
	String email;
	String batchName;
	
	// Rahul Data Print 

	public NonStaticconcept2()  //create constructor for Rahul
	{
		name ="Rahul";
		rollNo = 122;
		bloodGroup = 'B';
		mobileNo = 11111;	
		email = "rahul@gmail.com";
		batchName = "30JulyEve";
	}
	
	// Sumit Data to print
	
	public NonStaticconcept2(int x)
	{
		name ="Sumit";
		rollNo = 123;
		bloodGroup = 'o';
		mobileNo = 22222;	
		email = "sumit@gmail.com";
		batchName = "30JulyEve";
	}
	
	// create constructor for akshay
	
	public NonStaticconcept2(char z)
	{
		name ="akhay";
		rollNo = 124;
		bloodGroup = 'A';
		mobileNo = 3333;	
		email = "akshay@gmail.com";
		batchName = "30JulyEve";
	}
	
	// method to print student data
	
	public void printstudentData()
	{
		System.out.println( "Name is-->"+ name+
							"RollNo is-->"+rollNo+
							"BloodGroup is-->"+bloodGroup+
							"Mobile Number-->"+mobileNo+
							"Emild Id-->"+email+
							"Batch Name"+batchName);
	}
	
	
	// now call in main method
	
	public static void main(String[] args)
	
	{
		// create object forRahul
		NonStaticconcept2 r = new NonStaticconcept2();
		r.printstudentData();
		
		// create object for Sumit
		NonStaticconcept2 s = new NonStaticconcept2(100);
		s.printstudentData();
		
		// create object for akshay
		NonStaticconcept2 a = new NonStaticconcept2('A');
		a.printstudentData();
		
	}
	
}


