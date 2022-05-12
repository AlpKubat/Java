import java.util.Random;

public class RollingTwoDice {

	public static void main(String[] args) {
		
		for(int i = 0;i<10;i++)
			rollTwoDice();
	}
	
	public static void rollTwoDice()
	{
		Random random = new Random();    // Creating random object from Random class
		
		int dice1 = random.nextInt(6) + 1;	// Rolling first dice
		int dice2 = random.nextInt(6) + 1;      // Rolling second dice
		
		System.out.println("Dices: \n"+ dice1 + "  " + dice2);  // dices oto-casting to string
	}

}
