
public class Employee {

	int emp_no;
	String emp_name;
	
	Employee(int emp_no, String emp_name)
	{
		this.emp_no = emp_no;
		this.emp_name = emp_name;
	}
	
	public void display()
	{
		System.out.println(emp_no);
		System.out.println(emp_name);
		System.out.println();
	}
	
}

