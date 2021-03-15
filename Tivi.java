package newbegin;
import java.util.Scanner;

class Ctivi{
	private String[] channelList;
	private boolean isOn;
	private String currentChannel;
	public Ctivi() {
		
		channelList = new String [3];
		channelList[0]= "VTV1";
		channelList[1] = "VTV2";
		channelList [2] = "VTV3";
		
		isOn = false;
		currentChannel = "VTV1";
	}
	public Ctivi(String[] channelList) {
		super();
		this.channelList = channelList;
		isOn = false;
		currentChannel = channelList[0];
	}
	private String searchNextChannel (boolean isForward) {
		int currentIndex =-1;
		for(int i=0; i<currentChannel.length() ; i++) {
			if(channelList[i].equalsIgnoreCase(currentChannel)) {
				currentIndex =i;
				break;
			}
		}
		if(isForward) {
			currentIndex++;
			if(currentIndex >= channelList.length) {
				currentIndex =0;
			}
		}else {
			currentIndex--;
			if(currentIndex<0) {
				currentIndex = channelList.length -1;
			}
		}
		currentChannel = channelList[currentIndex];
		return currentChannel;
	}
	public void On() {
		isOn = true;
		System.out.println("----TIVI ON----");
	}
	public void Off() {
		isOn=false;
		System.out.println("----TIVI OFF----");
	}
	public void Switch() {
		if(isOn) {
			Off();
		}else {
			On();
		}
	}
	public void nextChannel() {
		if(isOn) {
			searchNextChannel(true);
			System.out.println("Current Channel: "+ currentChannel);
		}
	}
	public void previousChannel() {
		if(isOn) {
			searchNextChannel(false);
				System.out.println("Current Channel: "+currentChannel);
		}
	}
	public void Show() {
		if(isOn) {
			System.out.println("TIVI is On at channel: " + currentChannel);
		}else {
			System.out.println("TIVI is off. " );
			
		}
	}
}
public class Tivi {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		Ctivi tivi = new Ctivi();
		while (true) {
			System.out.println("1. Turn TV ON.");
			System.out.println("2. Turn TV OFF.");
			System.out.println("3. NEXT CHANNEL.");			
			System.out.println("4. PREVIOUS CHANNEL.");			
			System.out.println("5. SHOW TIVI INFORMATION.");
			System.out.println("6.EXIT.");
			System.out.println("CHOOSE:");
			String c=sc.nextLine();
			switch(c) {
			case "1":{
				tivi.On();
				break;
			}
			case "2":{
				tivi.Off();
				break;
			}
			case "3":{
				tivi.nextChannel();
				break;
			}
			case "4":
			{
				tivi.previousChannel();
				break;
			}
			case "5":
			{
				tivi.Show();
				break;
			}
			case "6":
				return ;
				
			default:
			{
				System.out.println("Input Fail! Try Again.");
			}
			
		}
		
	}}}


