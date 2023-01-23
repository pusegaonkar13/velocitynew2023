package collection;

import java.util.ArrayList;
import java.util.List;

public class Program3 
{
	public static void main(String[] args)
	{
	
//	 List --> Interface
//	  ArryList--> class
//	  Casting Syntax

	// All type of data			
	List a = new ArrayList();	
	
	a.add(10);
	a.add("Prish");
	a.add(90.80);
	a.add('P');
	System.out.println(a);
	
// Specific syntax
	
	List<Integer> b = new ArrayList<Integer>();
	
	b.add(30);	// index - 0
	b.add(40);  // index - 1
	b.add(50);  // index - 2
	System.out.println(b);

// print individual data use get method
	System.out.println(b.get(1));
	
// replace data with set method
	
	b.set(2, 100);
	System.out.println(b);
	
// count how many element in array
	
	int sizeArrayList = b.size();
	System.out.println("sizeArrayList-->"+sizeArrayList);
	
	
// remove data using remove method
	b.remove(0);
	System.out.println(b);
	
	
	
	
	
	
	
	}

}








