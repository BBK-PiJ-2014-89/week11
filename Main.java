
public class Main {
	public static void main(String[] args) {
		MobilePhone myPhone=new SmartPhone();
		SmartPhone mp=(SmartPhone)myPhone;//q2.2 downcast 'myPhone' to SmartPhone
		
		myPhone.call("123");
		myPhone.call("456");
		myPhone.call("789");
		mp.browseWeb("bbk moodle");//q2.2
		mp.findPosition();//q2.2
		myPhone.getBrand();
		myPhone.playGame("Tetris");
		myPhone.ringAlarm("alarm 1");
		myPhone.printLastNumbers();
		
		Phone mobilePhone=new MobilePhone();
		
		testPhone(mobilePhone);
	}
	
	public static void testPhone(Phone phone){
		phone.call("test Phone-123");
		
		SmartPhone dcPhone=(SmartPhone)phone;//Downcasting variable "phone" to SmartPhone
		dcPhone.findPosition();
		dcPhone.playGame("DOWNCASTING");
		
	}
}
