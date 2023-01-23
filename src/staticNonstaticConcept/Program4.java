package staticNonstaticConcept;

public class Program4 
{
	String name;
	int rollNo;
	char bGroup;
	int mobile;
	String emailid;
	String batch;
	
	// create constructor for prshant
	
	public Program4()
	{
		String name = "Prashant";
		int rollNo = 74;
		char bGroup = 'O';
		int mobile = 989064;
		String emailid = "prshant@gmail.com";
		String batch = "30 julyEve";
	}
	
	// crate constructor for sumit
	
	public Program4(int x)
	{
		String name1 = "Sumit";
		int rollNo1 = 79;
		char bGroup1 = 'B';
		int mobile1 = 989878;
		String emailid1 = "Sumit@gmail.com";
		String batch1 = "30 julyEve";
		
	}
		// create constructor rahul
	
	public Program4(char y)
	{
		String name2 = "Rahul";
		int rollNo2 = 76;
		char bGroup2 = 'A';
		int mobile2 = 989709;
		String emailid2 = "rahul@gmail.com";
		String batch2 = "30 julyEve";

	}
		// method for print student data
	
	public void method1()
	{
		System.out.println("Name is -->" + name
				  +"Roll No-->"+rollNo
				  +"Blood Group-->"+bGroup
				  +"Mobile No-->"+mobile
				  +"Email ID-->"+emailid
				  +"Batch Name -->"+batch);

	}
	
	
	// main method
	public static void main(String[] args)
	
	{	
		// create boject for prashant
		// and memory allocation for prshant
		
		Program4 k = new Program4();
		k.method1();

		Program4 m = new Program4(100);
		
	}
	
	
}














