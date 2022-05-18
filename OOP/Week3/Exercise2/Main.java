
public class Main {

	public static void main(String[] args) {
		
		Employee e1,e2,e3,e4;
		
		e1 = new Employee(100,"Sarah"); // e1 object whose parameters are assigned to 100 and «Sarah»
		e2 = e1;					// Assigning e1 to e2
		e3 = new Employee(200,"Jhon");	// e4 object whose parameters are assigned to 200 and «John».
		e4 = e3;					// Assigning e4 to e3
		
		e1.display();
		e2.display();				// Calling display method for each object
		e3.display();
		e4.display();
		
		e4.emp_no = 300;
		e4.emp_name = "David";		// Replace 300 and David with the parameters of e4 object
		
		e3.display();
		e4.display();
		
		e4 = new Employee(400,"Diana");	// Recreate object e4 with parameters of 400 and «Diana»
		
		e3.display();
		
		
		

	}

}
