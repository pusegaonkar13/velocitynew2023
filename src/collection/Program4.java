package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Program4
{	
	public static void main(String[] args)
	{
	
// List ---> Interface
// vector ---> class
// Syntax of upcasting
	
// for all type of data
		
	List a = new Vector();
	
  a.add(20);
  a.add('P');
  a.add("Prince");
  a.add(78.56);
  
  System.out.println(a);
 
  // for specific data type
  
 List<Integer> b = new Vector<Integer>();
 
   b.add(20);	// index-0
   b.add(30);	// index-1
   b.add(40);   // index-2 
// b.add("Prashant");   // not possible bcz its take only integer
// b.add('A');			// not possible
// b.add(89.88);		// not possible
   
   System.out.println(b);
   
  // print individual data use get method
   
   System.out.println(b.get(1));
   
  // replace data with set method
  b.set(2,35);
  System.out.println(b);
  
//count how many element in array
	
	int sizeArrayList = b.size();
	System.out.println("sizeArrayList-->"+sizeArrayList);
  
// remove data using remove method
		b.remove(0);
		System.out.println(b);
		
   
   
		
	}


}
