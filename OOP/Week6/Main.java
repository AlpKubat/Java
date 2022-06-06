package week7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item[] list = new Item[4];
		
		list[0] = new Product("Phone",599.99,30);
		list[1] = new Service("Repair",120,1);
		list[2] = new Product("Laptop",1499.99,15);
		list[3] = new Service("Battery change",200,3);
		
		double totalOfProduct = 0, totalOfService = 0;
		for(int i = 0;i < 4;i++)
		{
			if(list[i] instanceof Product)
				totalOfProduct += list[i].ComputeTaxedPrice();
			else
				totalOfService += list[i].ComputeTaxedPrice();
			}
		
		System.out.println("Total taxed price of Product is = "+ totalOfProduct);
		System.out.println("Total taxed price of Service is = "+ totalOfService);
	}

}
