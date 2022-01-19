package Remote;

public interface RemoteControl {

//	public static final boolean mute;
	
	public void turnOn();
	public void turnOff();
	public void setVolumn(int volumn);
	
	default void setMute(boolean mute) {};
	
	public static void changeBattery() {
		System.out.println(" > 배터리 교체");
	}
	
}
