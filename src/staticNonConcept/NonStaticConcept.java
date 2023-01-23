package staticNonConcept;

public class NonStaticConcept 

{
	int a=100;    // non static
	
	public static void main(String[] args)
	
	{
	//	case.1
   // creat on object
		NonStaticConcept x = new NonStaticConcept();
		
 		System.out.println(x.a);
 		
 		x.a =200;
 		System.out.println(x.a);
 		
 		//-------------------------------
 		
 	//	case .2
 		
 		
 		NonStaticConcept y = new NonStaticConcept();
 		
 		System.out.println(y.a);
 		
 		
 		
 		
 		
 		
 		
		
	}

}
