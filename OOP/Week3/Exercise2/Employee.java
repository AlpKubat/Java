
public class Employee {

	int emp_no;
	String emp_name;
	
	Employee(int emp_no, String emp_name)		// Constructor of class
	{
		this.emp_no = emp_no;
		this.emp_name = emp_name;
	}
	
	public void display()
	{
		System.out.println(emp_no);
		System.out.println(emp_name);		// displaying object
		System.out.println();
	}
	
}

