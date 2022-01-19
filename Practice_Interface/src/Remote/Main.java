package Remote;

public class Main {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolumn(6);
		tv.setMute(true);
		tv.setMute(false);
		tv.setVolumn(12);
		tv.turnOff();
		System.out.println("------------------");
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolumn(2);
		rc.setMute(true);
		rc.turnOff();
		

	}

}
