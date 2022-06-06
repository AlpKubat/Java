package week7;

public class Item {

	String name;
	double price;
	int amount;
	double total;
	
	public Item(String name, double price, int amount)
	{
		this.name = name;
		this.price = price;
		this.amount = amount;
		
		total = price * amount;
	}
	
	public double ComputeTaxedPrice()
	{
		return 0.0;
	}
}
