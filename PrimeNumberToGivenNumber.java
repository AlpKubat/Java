import java.util.Scanner;



public class PrimeNumberToGivenNumber {

	public static void main(String[] args) {
		

		Scanner inp = new Scanner(System.in);
		int num;
		do
		{
		System.out.print("Please Enter a positive number = "); // Taking Pleasing number
		num = inp.nextInt();
		}while (num < 0);					// if given number is negative asking again 
		
		primeToThis(num);			// calling the function
	
	}
	
	public static void primeToThis(int num)			// Prints Numbers that are prime to given number
	{
		for (int i = 2;i<num+1;i++)		// Increasing number
		{
			int count = 0;				// Counting if there is a dividing number
			for (int j = 1;j<i;j++)		// Increasing dividing numbers
			{
				if (i%j == 0) count++;
					
			}
			if (count == 1)			// dividing starts 1 because given number could be 1 so, if there is no more, then it is prime number
			{
				System.out.println(i);
			}
		}
		
	}

}
