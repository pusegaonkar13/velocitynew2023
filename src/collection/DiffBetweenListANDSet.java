package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffBetweenListANDSet
{
	public static void main(String[] args)
	{
		
// List allows us Duplicate values and Null Values as well
// it does not maintain order of insertion
		
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(40);		// duplicate
		a.add(null);
		a.add(null);
		System.out.println(a);
		System.out.println("Size --> "+a.size());
		
// **********************************************************
// Set Concept 
//1.Set Does Not allows us duplicate values as well null values
//2. It maintain the order of insertion
		
		Set<Integer> b = new HashSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(40);		// duplicate
		b.add(null);
		b.add(null);
		
		System.out.println(a);
		System.out.println("Size--> "+ b.size());
		
		
		
		
		
	}

}






