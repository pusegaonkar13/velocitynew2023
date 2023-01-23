package collection;

import java.util.ArrayList;

public class Program2 
{
	public static void main(String[] args)
	{
	
// we can use all type data with following syntax
		
//	ArrayList a = new ArrayList();	
	
// spcific data type int-->
	
	ArrayList<Integer> b = new ArrayList<Integer>();
	
	b.add(10);
	b.add(20);
//	b.add("Rahul");   not possible 
//  b.add('A');		  not possible
//  b.add(70.78);	  not possible	
	
	System.out.println(b);
	System.out.println(b.get(0));
	
	ArrayList<String> c = new ArrayList<String>();
	c.add("Prashant");
	c.add("Dhabe");
//	c.add('A');		// not possible 
//	c.add(90);		// not possible
	
	System.out.println(c);
	
	
 		
	}

}
