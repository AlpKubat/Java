package package2;
import package1.*;					// importing package1

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle();
		obj1.radius = 10.0;			// creating and defining an object
		
		obj1.calculate_area();
		obj1.calculate_perimeter();		// calling the functions of object
	}

}
