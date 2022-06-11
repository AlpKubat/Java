import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class VoteMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Person> list = new ArrayList();
		list.add(new Person("Ahmet", "Hello"));
		list.add(new Person("Mehmet", "Hi"));
		list.add(new Person("Ali", "Ola"));
		list.add(new Person("Nusret", "Boo"));
		list.add(new Person("Ayþe", "Hey"));
		
		Map <String, Integer> map = new HashMap<String, Integer>();
		map.put("Ahmet",0);
		map.put("Mehmet", 0);
		map.put("Ali", 0);
		map.put("Nusret", 0);
		map.put("Ayþe", 0);
		
		System.out.println("Candidate list:\n");
		for(Person p: list)
		{
			System.out.printf("%s, %s\n",p.Name_Surname,p.Message);
		}
		
		String name = "";
		while (!name.equals("q"))
		{
			System.out.print("Kime oy veriyorsun = ");
			name = sc.nextLine();
			if(map.containsKey(name))
			{
				
				map.replace(name, map.get(name) + 1);
				
			}
			else if (!name.equals("q"))
			{
				System.out.println("You entered wrong name!");
			}
			
		}
		
		String winName;
		int winVote = 0;
		
		for(int v: map.values())
		{
			if(v > winVote)
			{
				winVote = v;
			}
		}
		
		for (Entry<String, Integer> en: map.entrySet())
		{
			if(en.getValue() == winVote)
			{
				System.out.printf("Winner = %s with %d votes",en.getKey(),winVote);
			}
		}
		
		
		
		
		
	}

}
