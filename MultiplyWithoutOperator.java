import static java.lang.Math.abs;

public class MultiplyWithoutOperator {

	public static void main(String[] args) {
		
		System.out.println(multiply(5,-3));
		
	}
	
	public static int multiply(int num1, int num2)  // Multiplying with using LOOP 
	{
		int result = 0;
		boolean isNegative = false;	// Creating variable if result is negative
		
		if (num1 < 0)
			isNegative = !isNegative;
		if (num2 < 0)				// Testing if result is negative
			isNegative = !isNegative;
		
		num1 = abs(num1);
		num2 = abs(num2);			// changing value to absolute value to keep away from errors while looping
		for (int i = 0;i < num1;i++)
		{
			result += num2;
		}
		
		if (isNegative)
			return -result; // returning the solution
		return result;
	}

}
