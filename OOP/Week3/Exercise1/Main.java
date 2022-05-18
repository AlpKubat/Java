
public class Main {

	public static void main(String[] args) {
		
		coffee p1 = new coffee(0.6,100);	// p1 object whose parameters are assigned to 0.6 and 100
		coffee p2 = p1;				// Assigning p1 to p2.
		coffee p3 = new coffee(0.9,150);	// p3 object whose parameters are assigned to 0.9 and 150
		coffee p4 = p3;				// Assigning p3 to p4
		
		p1.calculat_price();
		p2.calculat_price();
		p3.calculat_price();			// Call calculate_price() method for each object.
		p4.calculat_price();
		
		p4.weight = 1.5;			// Replace 1.5 with the weight parameter of p4 object.
		
		p3.calculat_price();
		p4.calculat_price();			// Call display method for p3 and p4.
		
		p4 = new coffee(2,200);			// Recreate object p4 with parameters of 2 and 200.
		
		p3.calculat_price();
		p4.calculat_price();			// Call display method for p3 and p4
		

	}

}
