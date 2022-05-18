
public class Main {

	public static void main(String[] args) {
		
		coffee p1 = new coffee(0.6,100);
		coffee p2 = p1;
		coffee p3 = new coffee(0.9,150);
		coffee p4 = p3;
		
		p1.calculat_price();
		p2.calculat_price();
		p3.calculat_price();
		p4.calculat_price();
		
		p4.weight = 1.5;
		
		p3.calculat_price();
		p4.calculat_price();
		
		p4 = new coffee(2,200);
		
		p3.calculat_price();
		p4.calculat_price();
		

	}

}
