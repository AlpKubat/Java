
public class coffee {

	double weight;
	double unit_price;
	
	coffee(double weight, double unit_price)
	{
		this.weight = weight;
		this.unit_price = unit_price;
	}
	
	public void calculat_price()
	{
		System.out.println("Price = "+ weight * unit_price);
	}
}
