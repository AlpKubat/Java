import java.util.*;



public class ArrayToArrayList {
	public static void  main(String[] args) 
	{
		// Solution 1 

		String  array1[] = {"Array", "To", "ArrayList"}; // Creating an Array

		ArrayList<String>  list = new ArrayList<String>(Arrays.asList(array1)); // Creating ArrayList and assigning array elements to the ArrayList
  
		System.out.println(list);	// Printing first ArrayList

		// Solution 2

		String array2[] = {"Second", "Solution", "To", "The", "Problem"}; // Creating an array
		
		ArrayList<String> list2 = new ArrayList<String>();		// Creating ArrayList
		
		Collections.addAll(list2, array2);						// Creating ArrayList and assigning array elements to the ArrayList
		
		System.out.println(list2);	// Printing second ArrayList
  

	

  }
}