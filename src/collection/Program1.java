package collection;

import java.util.ArrayList;

public class Program1 
{
	public static void main(String[] args)
	{
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
		
//	for	more data
//		int c [] = {10,20,30,40,50};
	
//  if we have more data that time we use collection
// any type of data we use in collection 
// int , char, string ,double,float
		
// 1. Array of class
		
		ArrayList a = new ArrayList();
		
		a.add(10);		// index -0
		a.add(20);		// index -1
		a.add(30);		// index -2
		
		// we can use any type of data
		a.add("rahul");		// index -3
		a.add('A');			// index -4
		a.add(70.80); 		// index -5
	
		// to print all data
		System.out.println(a);

//2. to print specific data
		// get method- index value pass
		System.out.println(a.get(0));
		System.out.println(a.get(4));
		
//3. replace data with set method
		// index   4 -> A --> B
	a.set(4, 'B');	
	System.out.println(a);
	
// 4. size method to count the number of element 
	int sizeArrayList = a.size();
	System.out.println("sizeArrayList-->"+sizeArrayList);
	
// 5. remove the data ---> remove method
		// remove by passing index
	
	a.remove(5);
	System.out.println(a);
	
	System.out.println("final size-->"+a.size());
		
		
		
		
		
	}

}
