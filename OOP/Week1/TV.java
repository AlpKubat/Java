package Week1;

public class TV {

	int channel,volumeLevel;  // Creating TV attributes
	boolean ON;
	
	public TV()
	{
		this.channel = 1;		// Defining default values in constructor
		this.volumeLevel = 1;
	}
	
	
	public void setChannel(int newChannel)
	{
		if (newChannel > 0 && newChannel < 121)		// Checking if given value is right 
			this.channel = newChannel;
		else
			System.out.println("You entered unavailable channel number");
	}
	
	public void setVolume(int newVolume)
	{
		if (newVolume > 0 && newVolume < 8)			// Checking if given value is right 
			this.volumeLevel = newVolume;
		else
			System.out.println("You entered unavailable volume level");
	}
	
	public void channelUp()
	{
		if(this.channel < 120)
			this.channel++;
		else
			this.channel = 1;		// Channels order is circle
	}
	
	public void volumeUp()
	{
		if (this.volumeLevel < 7)
			this.volumeLevel++;
	}
}
