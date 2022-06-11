import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Interface1> list = new ArrayList<Interface1>(); 
		
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Dog());
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());
		
		
		for(Interface1 i: list)
		{
			i.speak();
			i.walk();
			i.swim();
			System.out.println();
		}
	}

}
