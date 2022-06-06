package week7;

public class Product extends Item{

	public Product(String name, double price, int amount)
	{
		super(name,price,amount);
	}
	
	public double ComputeTaxedPrice()
	{
		return total * 1.18;
	}
}
