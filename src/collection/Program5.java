package collection;

import java.util.List;
import java.util.Stack;

public class Program5 
{
	public static void main(String[] args)
	{
		
//		List---> Interface
//		Stack---> class
		
//		syntax of casting
	
// all type of data type is available		
		List a = new Stack();
		
		a.add(20);
		a.add(30);
		a.add(40);
		a.add("prish");
		a.add('A');
		a.add(78.90);
	System.out.println(a);	
	
// for specific data type
	
 List<String> b = new Stack<String>();
 
 	b.add("Prashant"); // index 0
 	b.add("Rahul");    // index 1	
 	b.add("Pradhnya"); // index 2
 	b.add("Aishwarya");// index 3 
 // b.add(60);	// not possible 
 	
 System.out.println(b);
 
// print individual using get method
 
 System.out.println(b.get(0));

 // replace data with set method 
 
 b.set(0, "prish");
 System.out.println(b);
 
// count how many element in array
 
 int sizeofArray = b.size();
 System.out.println("sizeofArray--->"+sizeofArray);
 
// remove data using remove method
 
 b.remove(3);
 System.out.println(b);
 
 
		
	}

		
	

}


