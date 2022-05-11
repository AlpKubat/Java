public class Linkedlist {
	LinkedlistNode head;
	
	public boolean isEmpty() 	// returning True or False depends LinkedList is empty or not
	{
		return head == null;
	}
	
	public void insert(int data) // Adding element to the end of the structure.
	{
		LinkedlistNode newElement = new LinkedlistNode(data);
		if (head == null)      // if LinkedList is empty.It is checking before the traversal.
			head = newElement;

		else
		{
			newElement.next = head;  // İnserting element to the top because it is simple
			head = newElement;
		}
	}
	
	public void delete(int data)
	{
		if (head.data == data)
			head = null;
		
		else
		{
			LinkedlistNode temp = head;
			while (temp.next.data != data)		// travel till to find before of the element
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;			// connecting before element end after so, we can delete desired element
		}
	}
	
	public void show()
	{
		LinkedlistNode temp = head.next;
		System.out.print(head.data);		// to solve fence-post problem
		while(temp !=null)
		{
			System.out.print(", "+ temp.data);
			temp = temp.next;
		}
	}
}
