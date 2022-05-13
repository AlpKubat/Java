package Week1;

public class Main {

	public static void main(String[] args) {
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		// Testing 
		System.out.println("first televisions channel = "+ tv1.channel+"  volumeLevel = "+tv1.volumeLevel);
		tv1.setChannel(50);
		tv1.setVolume(10);
		System.out.println("first televisions channel = "+ tv1.channel+"  volumeLevel = "+tv1.volumeLevel);
		
		
		System.out.println("second televisions channel = "+ tv2.channel+"  volumeLevel = "+tv2.volumeLevel);
		tv2.setChannel(120);
		tv2.setVolume(7);
		System.out.println("second televisions channel = "+ tv2.channel+"  volumeLevel = "+tv2.volumeLevel);
		tv2.volumeUp();
		tv2.channelUp();
		System.out.println("second televisions channel = "+ tv2.channel+"  volumeLevel = "+tv2.volumeLevel);
		

	}

}
