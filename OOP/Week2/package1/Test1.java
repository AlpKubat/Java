package package1;

public class Test1 {

	public static void main(String[] args) {
		
		Circle obj1 = new Circle();
		obj1.radius = 10.0;		// creating and defining an object
		
		obj1.calculate_area();
		obj1.calculate_perimeter();	// calling the functions of object
	}

}
