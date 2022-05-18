package package1;

public class Circle {

	public double radius;
	final double pi = 3.14;
	
	
	public double calculate_area()
	{
		return (pi * radius * radius);
	}
	
	public double calculate_perimeter()
	{
		return (2 * pi * radius);
	}
}
