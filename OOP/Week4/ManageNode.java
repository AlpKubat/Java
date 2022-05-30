
public class ManageNode {

	public static void main(String[] args) {
		// creation objects in order and bounded.
		Node n1 = new Node("1");
		Node n2 = new Node("2",n1);
		Node n3 = new Node("3",n2);
		Node n4 = new Node("4",n3);
		Node n5 = new Node("5",n4);
		Node n6 = new Node("6",n5);
		Node n7 = new Node("7",n6);
		Node n8 = new Node("8",n7);
		Node n9 = new Node("9",n8); 
		
		// printing far left to right.
		System.out.println(n9.getPath());
		
	}

}
