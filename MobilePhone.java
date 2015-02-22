import java.util.ArrayList;


class MobilePhone extends OldPhone {
	private ArrayList<String> numberList;
	
	public MobilePhone() {
		super("iPhone");
		this.numberList=new ArrayList<String>();
		
	}
	
	@Override
	public void call(String number){
		System.out.println("Calling "+number);
		numberList.add(number);
	}
	public void ringAlarm(String alarm){
		System.out.println(alarm+" alarm is ringigng");
	}
	public void playGame(String game){
		System.out.println("Playing game "+game);
	}
	
	public void printLastNumbers(){
		int limit;
		if(numberList.size()<=10){
			limit=numberList.size();
		}else limit=10;
		int counter=0;
		while(counter<limit){
			System.out.println(numberList.get(numberList.size()-counter-1).toString());
			counter++;
		}
	}
}
