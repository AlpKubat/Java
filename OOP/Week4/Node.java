
public class Node {

	String name;
	Node left;
	
	Node(String name)
	{
		this.name = name;
	}
	
	Node(String name, Node left)
	{
		this.name = name;
		this.left = left;
	}
	
	// recursive function that prints nodes far left to right.
	public String getPath()
	{
		if (left == null) // base condition if node is leftmost.
			return this.name;
		return left.getPath() + "/" +  this.name;
	}
}
