import java.util.Random;


public class SmartPhone extends MobilePhone {
	private Random rand=new Random();
	private int n;
	
	public SmartPhone() {
		super();		
	}
	
	public void browseWeb(String web){
		System.out.println(web);
	}
	public void findPosition(){
		System.out.println("current location: "+rand.nextInt(99999));
	}
	public void playGame(String game){
		System.out.println("Playing game "+game);
	}
	@Override
	public void call(String number) {
		if(number.substring(0, 2).equals("00")) {
			System.out.println("Calling "+number+" through the internet to save money");
		}else super.call(number);
	}
}
