package package1;

public class Circle {

	public double radius;
	final double pi = 3.14;		// defining variables
	
	
	public double calculate_area()		
	{
		return (pi * radius * radius);		// circle area formula is A = π r²
	}
	
	public double calculate_perimeter()		// circle perimeter formula is 2πr
	{
		return (2 * pi * radius);
	}
}
