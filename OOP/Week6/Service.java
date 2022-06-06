package week7;

public class Service extends Item{

	public Service(String name, double price, int amount)
	{
		super(name,price,amount);
	}
	
	public double ComputeTaxedPrice()
	{
		return total * 1.01;
	}
}
